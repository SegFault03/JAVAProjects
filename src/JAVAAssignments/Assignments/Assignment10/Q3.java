package JAVAAssignments.Assignments.Assignment10;

public class Q3 {
    int x=0;
    static boolean flag = false;
    void increaseX()
    {
        x++;
    }

    public static void main(String[] args) {
        Q3 temp = new Q3();
        IncrementX increment = new IncrementX(temp);
        PrintValue printValue = new PrintValue(temp);
        increment.start();
        printValue.start();
    }
}

class IncrementX extends Thread
{
    final Q3 ob;
    IncrementX(Q3 t)
    {
        ob = t;
    }
    @Override
    public void run()
    {
        int i=-1;
        while(++i<10) {
            //Wait while flag is true
            while(Q3.flag);
            Q3.flag=false;
            synchronized (ob) {
                ob.increaseX();
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                notify();
            }
            Q3.flag=true;
        }
    }
}

class PrintValue extends Thread
{
    final Q3 ob;
    PrintValue(Q3 t)
    {
        ob = t;
    }
    @Override
    public void run()
    {
        int i=-1;
        while(++i<10) {
            //Wait if flag is false
            while(!Q3.flag);

            //Inform other threads that the resource is now locked, not doing this
            //might cause a deadlock when other threads try to lock an already locked resource
            Q3.flag=true;

            //Lock the resource. This is important as it is used by two different threads.
            //Not doing this might cause incorrect values to be read or written, as we do not know
            //exactly when a thread might wake up even after calling sleep()
            synchronized (ob) {
                System.out.println(ob.x);
                try {
                    //Drop the resource for 1s. NOTE: wait() drops the resource, sleep() DOES NOT
                    //Calling sleep() inside a synchronized block means that the resource remains locked
                    //even while the thread is sleeping
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

                //Notify any thread waiting on the resource that it is now available
                notify();
            }
            //Notify that the resource is no longer locked
            Q3.flag=false;
        }
    }
}


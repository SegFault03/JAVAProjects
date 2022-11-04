package JAVAAssignments.Tests.Threads;
public class ThreadTest {
    static int check=0;
    public static void main(String[] args) {
        ChildThread thread_a = new ChildThread(7,"Thread A");
        ChildThread thread_b = new ChildThread(3,"Thread B");
        System.out.println(check);
        thread_b.start();
        thread_a.start();
        try{
            thread_a.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(check);
        try{
            thread_b.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(check);
    }
}

class ChildThread extends Thread
{
    int t;
    public ChildThread(int p,String name)
    {
        t=p;
        setPriority(p);
        setName(name);
    }

    @Override
    public void run()
    {
        System.out.println(getName()+" is running");
        ThreadTest.check=t;
    }
}

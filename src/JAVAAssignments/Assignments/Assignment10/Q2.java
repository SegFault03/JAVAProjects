package JAVAAssignments.Assignments.Assignment10;
import JAVAAssignments.Assignments.Assignment10.ChildThread;
public class Q2 {
    public static void main(String[] args) {
        ChildThread thread_1 = new ChildThread(10,"A");
        ChildThread thread_2 = new ChildThread(9,"B");
        ChildThread thread_3 = new ChildThread(8,"C");

        //START THREAD 3
        thread_3.start();

        //WAIT FOR THREAD 3 TO FINISH BEFORE STARTING THREAD 2
        try{
            thread_3.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        thread_2.start();

        //WAIT FOR THREAD 2 TO FINISH BEFORE STARTING THREAD 1
        while (thread_2.isAlive());
        thread_1.start();
    }
}

package JAVAAssignments.Assignments.Assignment10;
public class Q1 {
    public static void main(String[] args) {
        ChildThread thread_a = new ChildThread(7,"Thread A");
        ChildThread thread_b = new ChildThread(3,"Thread B");
        thread_b.start();
        thread_a.start();
    }
}

class ChildThread extends Thread
{
    public ChildThread(int p,String name)
    {
        setPriority(p);
        setName(name);
    }

    @Override
    public void run()
    {
        System.out.println(getName()+" is running");
    }
}

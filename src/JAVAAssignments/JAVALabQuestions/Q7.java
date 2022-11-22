package JAVAAssignments.JAVALabQuestions;

public class Q7 {
    public static void main(String[] args) {
        ChildThread childThread = new ChildThread("A");
        childThread.start();
        //ALTERNATIVELY
        Thread childThread2 = new ChildThread("B");
        childThread2.start();
        Thread childThread3 = new Thread(new ChildThread("C"));
        childThread3.start();
        TestThread testThread = new TestThread();
        //PART B IS LINEAR SEARCH...CAN'T EXPECT ME TO WRITE THAT LOGIC....
    }
}

class ChildThread extends Thread
{
    ChildThread(String name)
    {
        this.setName(name);
    }
    public void run()
    {
        System.out.println("The child thread "+getName()+ " is running now.");
    }
}

class TestThread extends Thread
{
    Thread temp;
    TestThread()
    {
        setName("D");
        temp = new Thread(this);
        temp.start();
    }
    public void run()
    {
        System.out.println("The child thread "+getName()+ " is running now.");
    }
}
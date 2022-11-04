package JAVAAssignments.Tests.Threads;

public class AnonThread {
    public static void main(String[] args) {
        Thread ob = new Thread(){
            public void run()
            {
                System.out.println((2+3));
            }
        };
        ob.start();
    }
}

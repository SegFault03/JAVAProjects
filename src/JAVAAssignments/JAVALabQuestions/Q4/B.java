package JAVAAssignments.JAVALabQuestions.Q4;
abstract class Abstract{
    abstract void run();
}
public class B extends Abstract{
    @Override
    void run() {
        System.out.println("Running!");
    }

    public static void main(String[] args) {
        Abstract ob = new B();
        ob.run();
    }
}

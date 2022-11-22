package JAVAAssignments.JAVALabQuestions.Q10;

abstract class Abstract{
    abstract public int sum(int a, int b);
}

public class B extends Abstract{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }


    public static void main(String[] args) {
        System.out.println(new B().sum(2,3));
    }
}


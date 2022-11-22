package JAVAAssignments.JAVALabQuestions.Q5;

public class B {
    public int fact(int n)
    {
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(new B().fact(5));
    }
}

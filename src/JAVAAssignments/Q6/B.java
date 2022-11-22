package JAVAAssignments.Q6;

class Super{
    int a=5;
}
public class B extends Super{
    int a = 6;

    public static void main(String[] args) {
        System.out.println(new B().a);          //Prints sub class variable
        System.out.println(new Super().a);      //Prints super class variable, no overriding
    }
}

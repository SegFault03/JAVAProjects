package JAVAAssignments.Tests.StaticNonStatic;

public class Test {
    static int a=0;
    public static void doNothing()
    {
        System.out.println("Hi!");
    }
    public static void main(String[] args) {
        Test ob1 = new Test();
        Test ob2 = new Test();
        System.out.println(ob1.a);
        Test.a++;
        System.out.println(ob2.a);
        ob1.doNothing();
    }
}

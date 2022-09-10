package JAVAAssignments.Tests.Inheritance;


public class SubClassForA extends SuperClass{
    int c;
    public static final String SUBCLASS_NAME="SubClassForA";

    SubClassForA(int a,int b,int c)
    {
        super(a, b);
        this.c=c;
    }

    public static void displayClassName()
    {
        System.out.println("Class name = "+ CLASS_NAME);
        System.out.println("Class name = "+ SUBCLASS_NAME);
    }

    public int getSum() {
        return super.getA() + super.getB() + c;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("c="+c);
    }
}

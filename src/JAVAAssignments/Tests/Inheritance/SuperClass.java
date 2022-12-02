package JAVAAssignments.Tests.Inheritance;

public class SuperClass {
    private int a,b;
    public static final String CLASS_NAME ="SuperClass";

    /**
     * SuperClass constructor
     * @param a
     * @param b
     */
    SuperClass(int a, int b)
    {
        this.a=a;
        this.b=b;
    }

    /**
     * displays value of a and b {@link this.a}
     */
    public void display()
    {
        System.out.println("a= "+"\n"+"b= ");
    }

    /**
     * displays a test string
     */
    public void callUsingSubClassObject()
    {
        System.out.println("This is called using the sub class object");
    }

    /**
     * static object for displaying class name
     */
    public static void displayClassName()
    {
        System.out.println("Class name = "+ CLASS_NAME);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}

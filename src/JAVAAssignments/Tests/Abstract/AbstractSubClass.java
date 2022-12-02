package JAVAAssignments.Tests.Abstract;

public class AbstractSubClass extends Test implements TestI,Test2{
    AbstractSubClass(int c, int d) {
        super(c, d);
    }

    void fun2()
    {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Test ob = new AbstractSubClass(1,2);
        AbstractSubClass ob3 = new AbstractSubClass(1,2);
        ob3.display();
        ob3.test();
        ob3.fun2();
    }

    @Override
    public void test() {
        System.out.println("Hello2");
    }

}

package JAVAAssignments.Tests.Abstract;

public abstract class Test{
    int a,b;
    Test(int c, int d)
    {
        a = c;
        b = d;
    }
    void display()
    {
        System.out.println("Hi"+a+b);
    }

    abstract void fun2();
}

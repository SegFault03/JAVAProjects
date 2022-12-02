package JAVAAssignments.Tests.Abstract;

public interface Test2 {
    void test();
    default void fun3()
    {
        System.out.println("Hi");
    }
}

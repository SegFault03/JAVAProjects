package JAVAAssignments.Tests.Generics;

public class GenericTest<V> {
    int[] a;
    GenericTest()
    {
        a=new int[5];
    }
    static void print(Object ... objects)
    {
        for(Object o: objects)
            System.out.println(o);
    }

    static <T extends Number> void getSum(T ... t)
    {
        T sum = null;
        for(T o: t)
            System.out.println(o);
    }

    void doNothing()
    {
        System.out.println("hehe");
    }

    public static void main(String[] args) {
        Object o[] = {1,"Hello",12.44};
        Integer a[]= {1,2,3,4,5,6};
        print(o);
        getSum(a);
        GenericTest<Integer> ob = new GenericTest<Integer>();
    }
}

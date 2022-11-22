package JAVAAssignments.JAVALabQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static List<Integer> memory;
    public static void overload(int i)
    {
        System.out.println("Method with only one int param called");
    }

    public static void overload(String s)
    {
        System.out.println("Method with only one String param called");
    }

    public static void overload(int a, int b)
    {
        System.out.println("Method with two int param called");
    }

    public static void overload()
    {
        System.out.println("Method with no param called");
    }

    //Used for finding the number in the fibbonacci series that is <= n
    public static void fibbonacci(int n)
    {
        System.out.print("0 1 ");
        int a = 0;
        int b = 1;
        int c;
        for(;;)
        {
            c = a + b;
            if(c>n)
                break;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }

    //ALTERNATIVELY
    //Used for finding the n+2 th (Cause 0,1 are not counted) of the fibbonacci series. Uses DP.
    public static int fibbonacciUsingDP(int n)
    {
        if(memory.size()<=n)
        {
            memory.add(fibbonacciUsingDP(n-1)+fibbonacciUsingDP(n-2));
            System.out.print(memory.get(n)+" ");
        }
        return memory.get(n);
    }

    public static void main(String[] args) {
        System.out.println("(a)");
        overload();overload(5);overload("N");overload(2,3);
        System.out.println("(b)");
        fibbonacci(12);

        //ALTERNATIVELY
        memory = new ArrayList<>();
        memory.add(0);memory.add(1);
        System.out.println();
        int temp = fibbonacciUsingDP(12);
    }

}

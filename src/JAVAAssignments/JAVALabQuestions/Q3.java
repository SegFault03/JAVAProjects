package JAVAAssignments.JAVALabQuestions;

import java.util.Stack;

public class Q3 {
    static int temp=2;
    public static void method()
    {
        System.out.println("Lorem Ipsum");
    }

    public static void main(String[] args) {
        //Using JCF
        System.out.println("(a)");
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(5);
        System.out.println(stack);
        stack.push(6);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

        System.out.println("(b)");
        Q3 ob = new Q3();
        System.out.println(Q3.temp);    //USING class name to get a static member of that class
        Q3.method();                    //USING class name to call a static member method of that class
        Q3 ob2 = new Q3();
        System.out.println(ob2.temp);   //They can also be accessed via objects
        ob.temp = 5;                    //static variables do not change values across objects
        System.out.println(ob.temp);
        System.out.println(ob2.temp);   //Although we used ob to change temp, the change is reflected in ob2 as well.
    }
}

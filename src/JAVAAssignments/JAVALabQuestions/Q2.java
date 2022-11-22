package JAVAAssignments.JAVALabQuestions;

class superClass {
    int superInstanceVar;
    superClass(int a)
    {
        superInstanceVar = a;
    }

    //LET'S SEE WHAT HAPPENS IF WE TRY TO OVERRIDE A STATIC METHOD
    public static void testMethod()
    {
        System.out.println("This is super class static method");
    }

    public void overriddenMethod()
    {
        System.out.println("This is super class method");
    }
}

class subClass extends superClass{
    subClass(int a)
    {
        super(a);
    }

    //NOTE: A non-static method cannot override a static method. The vice-versa is also true. In
    //other words overridden methods must have the same access modifiers.
    public static void testMethod()
    {
        System.out.println("This is sub class static method");
    }

    @Override
    public void overriddenMethod() {
        System.out.println("This is sub class method");
    }
}

public class Q2{
    public static void main(String[] args) {
        subClass ob = new subClass(5);
        ob.overriddenMethod();
        System.out.println("Super class member = "+ob.superInstanceVar);
        //Creating a superclass ref
        superClass ob2 = new subClass(3);
        //This will call the super class method. Also see how we're using an object to call a static method
        ob2.testMethod();
        //Non static methods get overridden however
        ob2.overriddenMethod();
        //The only way we can access static subclass method is by calling it normally or by using its object
        ob.testMethod();
    }
}

package TestProject.Assignments.Assignment3.question_1;
public class Main {
    public static void main(String[] args) {
        Parent ob = new Parent();
        Child ob2 = new Child();
        System.out.println("Called using object of parent class");
        ob.display2();
        System.out.println("Called using object of child class");
        ob2.display();
        System.out.println("Called using object of child class");
        ob2.display2();
    }
}

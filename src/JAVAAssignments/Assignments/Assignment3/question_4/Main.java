package JAVAAssignments.Assignments.Assignment3.question_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length,breadth;
        System.out.println("Enter 2 for square, 1 for rectangle");
        int ch = sc.nextInt();
        Rectangle ob;
        if(ch==1) {
            System.out.println("Enter length");
            length = sc.nextDouble();
            System.out.println("Enter breadth");
            breadth = sc.nextDouble();
            ob = new Rectangle(length,breadth);
        }
        else {
            System.out.println("Enter side");
            length = sc.nextDouble();
            ob = new Square(length);
        }
        ob.printArea();
        ob.printPerimeter();
    }
}

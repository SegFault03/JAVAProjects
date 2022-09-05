package TestProject.Assignments.Assignment3.question_4;

public class Rectangle {
    double length,breadth;

    public Rectangle(double length, double breadth) {
        this.length=length;
        this.breadth=breadth;
    }

    void printArea()
    {
        System.out.println("Area: "+length*breadth);
    }
    void printPerimeter()
    {
        System.out.println("Perimeter: "+2*(length+breadth));
    }
}

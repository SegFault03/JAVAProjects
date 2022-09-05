package TestProject.Assignments.Assignment3.question_3;

public class Manager extends Member {
    String department;
    Manager(String Name, String Address, int age, String Phone_number, String department, int Salary)
    {
        super(Name,Address,age,Phone_number,Salary);
        this.department=department;
    }
    public void printdetails()
    {
        System.out.println("Name: "+Name+"\nAge: "+Age+"\nPhone number: "+Phone_number+"\nAddress: "+Address+"\nDepartment: "+department);
        super.printSalary();
    }
}

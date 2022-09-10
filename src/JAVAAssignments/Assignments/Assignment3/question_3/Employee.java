package JAVAAssignments.Assignments.Assignment3.question_3;

public class Employee extends Member {
    String specialization;
    Employee(String Name, String Address, int age, String Phone_number, String Specialization, int Salary)
    {
        super(Name,Address,age,Phone_number,Salary);
        this.specialization=Specialization;
    }
    public void printdetails()
    {
        System.out.println("Name: "+Name+"\nAge: "+Age+"\nPhone number: "+Phone_number+"\nAddress: "+Address+"\nSpecialization: "+specialization);
        super.printSalary();
    }
}

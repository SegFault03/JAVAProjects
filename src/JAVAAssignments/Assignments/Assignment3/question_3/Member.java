package JAVAAssignments.Assignments.Assignment3.question_3;

public class Member {
    public String Name,Address,Phone_number;
    public int Age,Salary;

    public Member(String Name, String address, int Age, String Phone_number, int Salary) {
        this.Salary=Salary;
        this.Name=Name;
        this.Age=Age;
        this.Address=address;
        this.Phone_number=Phone_number;
    }

    public void printSalary()
    {
        System.out.println("Salary: "+Salary);
    }
}

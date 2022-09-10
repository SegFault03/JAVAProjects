package JAVAAssignments.Assignments.Assignment2.Q5;

public class Employee {
String firstName,lastName;
double monthlySalary;
Employee(String fn,String ln, double s)
{
    firstName=fn;
    lastName=ln;
    monthlySalary=Math.max(s,0);
}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = Math.max(monthlySalary,0);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    double yearlySalary()
    {
        return monthlySalary*12;
    }
}

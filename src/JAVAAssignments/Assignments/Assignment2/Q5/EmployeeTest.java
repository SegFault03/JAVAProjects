package JAVAAssignments.Assignments.Assignment2.Q5;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] emp_arr = new Employee[2];
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter Employee "+(i+1)+"  first name followed by last name: ");
            String fn = scanner.next();
            String ln = scanner.next();
            System.out.println("Enter his/her monthly salary: ");
            double s = scanner.nextDouble();
            emp_arr[i]=new Employee(fn,ln,s);
            System.out.println("Employee "+(i+1)+": "+ emp_arr[i].getFirstName()+" "+ emp_arr[i].getLastName()+" ;"+" Yearly Salary: "+ emp_arr[i].yearlySalary());
            scanner.nextLine();
        }
        System.out.println("Increasing employee salaries by 10%");
        for (int i=0;i<2;i++) {
            emp_arr[i].setMonthlySalary((emp_arr[i].getMonthlySalary() * 11) / 10);
            System.out.println("Employee " + (i + 1) + ": " + emp_arr[i].getFirstName() + " " + emp_arr[i].getLastName() + " ;" + " Yearly Salary: " + emp_arr[i].yearlySalary());
        }
    }
}

package TestProject.Assignments.Assignment3.question_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=sc.nextLine();
        System.out.println("Enter Address");
        String address = sc.nextLine();
        System.out.println("Enter Age");
        int age = sc.nextInt();
        System.out.println("Enter Phone Number");
        sc.nextLine();
        String phone_number = sc.nextLine();
        System.out.println("Enter Salary");
        int salary = sc.nextInt();
        System.out.println("Are you a manager or an employee? Press 0 for manager, 1 for manager: ");
        int ch= sc.nextInt();
        if(ch==1)
        {
            System.out.println("Enter Department name");
            String department = sc.nextLine();
            Manager ob = new Manager(name,address,age,phone_number,department,salary);
            ob.printdetails();
        }
        else
        {
            System.out.println("Enter Specialization name");
            String specialization = sc.nextLine();
            Employee ob = new Employee(name,address,age,phone_number,specialization,salary);
            ob.printdetails();
        }
    }
}

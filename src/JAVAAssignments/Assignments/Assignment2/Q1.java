package JAVAAssignments.Assignments.Assignment2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers a and b, enter '0' to exit:");
        a=scanner.nextInt();
        if(a==0)
            return;
        do {
            b=scanner.nextInt();
            System.out.println("The sum is: "+(a+b));
            System.out.println("Enter numbers a and b, enter '0' to exit:");
            a=scanner.nextInt();
        }while (a!=0);
    }
}

package JAVAAssignments.Assignments.Assignment4;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to encode: ");
        n = sc.nextInt();
        int a = n/10;
        int b = n%10;
        System.out.println("The encoded number is -> "+(Math.pow(a,b)-a*b));
    }
}

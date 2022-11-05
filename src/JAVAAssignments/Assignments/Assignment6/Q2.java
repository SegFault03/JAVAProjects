package JAVAAssignments.Assignments.Assignment6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        StringBuilder str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str = new StringBuilder(sc.nextLine());
        StringBuilder strR = new StringBuilder(str);
        strR.reverse();
        if(strR.toString().equals(str.toString()))
            System.out.println("It is a palindrome");
        else
            System.out.println("Not a palindrome");
    }
}

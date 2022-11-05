package JAVAAssignments.Assignments.Assignment6;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str = sc.nextLine();
        String[] words = str.split(" ");
        System.out.println("Number of words: "+words.length+"\nNumber of characters: "+str.length());
    }
}

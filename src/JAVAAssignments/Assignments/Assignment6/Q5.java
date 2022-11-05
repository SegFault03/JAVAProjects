package JAVAAssignments.Assignments.Assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str = sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
           if(str.charAt(i)!=' ' && str.indexOf(str.charAt(i),i+1)!=-1) {
               str=str.replace(str.charAt(i),' ');
               count++;
           }
        }
        System.out.println(count);
    }
}

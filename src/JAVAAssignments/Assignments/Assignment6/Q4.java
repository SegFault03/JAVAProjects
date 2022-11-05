package JAVAAssignments.Assignments.Assignment6;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        String str, str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        str = sc.nextLine();
        System.out.println("Enter first string");
        str2 = sc.nextLine();
        int i = 0;
        StringBuilder s_a= new StringBuilder();
        StringBuilder s_b= new StringBuilder();
        while(i<str.length() && i<str2.length())
        {
            char a = str.charAt(i);
            char b = str2.charAt(i);
            if(a>=65 && a<=90)
                s_b.append(b);
            if(b>=65 && b<=90)
                s_a.append(a);
            i++;
        }
        System.out.println(s_a.append(s_b));
    }
}

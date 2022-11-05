package JAVAAssignments.Assignments.Assignment6;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        String str,str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        str = sc.nextLine();
        System.out.println("Enter first string");
        str2 = sc.nextLine();
        boolean isPresent=false;
        if(str2.length()>str.length()) {
            System.out.println(false);
            return;
        }
        for(int i=0;i<str2.length();i++)
        {
            isPresent = false;
            for(int j=0;j<str.length();j++)
            {
                if(str2.charAt(i)==str.charAt(j)) {
                    isPresent = true;
                    break;
                }
            }
            if(!isPresent)
                break;
        }
        System.out.println(isPresent);
    }
}

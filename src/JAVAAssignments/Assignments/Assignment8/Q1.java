package JAVAAssignments.Assignments.Assignment8;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bit string");
        s=sc.next();
        boolean flag = false;
        int count=0;
        if(s.charAt(0)=='0')
        {
            System.out.println("0");
            return;
        }
        else
        {
            count+=1;
            flag = true;
            for(int i=1;i<s.length();i++)
            {
                if(flag && s.charAt(i)=='0') {
                    count += 1;
                    flag = false;
                }
                if(!flag && s.charAt(i)=='1')
                {
                    count += 1;
                    flag = true;
                }
            }
        }
        System.out.println(count);
    }
}

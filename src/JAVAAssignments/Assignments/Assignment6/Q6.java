package JAVAAssignments.Assignments.Assignment6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str = sc.nextLine();
        String phone ="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=65 && str.charAt(i)<89 && str.charAt(i)!='S')
                phone+=((str.charAt(i)-65)/3)+2;
            else if (str.charAt(i)==89 || str.charAt(i)==90) {
                phone+="9";
            } else if (str.charAt(i)=='S') {
                phone+="7";
            } else
                phone+=str.charAt(i);
        }
        System.out.println(phone);
    }
}

package TestProject.Tests.Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        SubClassForA ob = new SubClassForA(a,b,c);
        SubClassForA.displayClassName();
        ob.display();
        ob.callUsingSubClassObject();
        System.out.println("The sum is = "+ob.getSum());
    }
}

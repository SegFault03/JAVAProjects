package JAVAAssignments.Assignments.Assignment3.question_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mac,pc,mc;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for newspaper ad, 2 for hoardings ad, and 3 for TV commercial: ");
        int ch= sc.nextInt();
        Advertise ob;
        switch (ch) {
            case 1 -> {
                System.out.print("Enter column cms: ");
                double cms = sc.nextDouble();
                mac = 12.5;
                pc = 10.5;
                mc = 5.5;
                ob = new Newspaper(mac, pc, mc, cms);
            }
            case 2 -> {
                System.out.print("Enter number of days: ");
                int no_of_days = sc.nextInt();
                System.out.println("Is it to be at a prime location? 1 for YES, 0 for NO: ");
                int prime = sc.nextInt();
                mac = 25.5;
                pc = 20.5;
                mc = 10.5;
                if (prime == 0)
                    ob = new Hoarding(mac, pc, mc, no_of_days);
                else
                    ob = new Hoarding(mac, pc, mc, no_of_days, true);
            }
            case 3 -> {
                System.out.print("Enter air time: ");
                double air_time = sc.nextDouble();
                System.out.println("Is it to be at a prime slot? 1 for YES, 0 for NO: ");
                int prime_time = sc.nextInt();
                mac = 50.5;
                pc = 40.5;
                mc = 20.5;
                if (prime_time == 1)
                    ob = new Commercial(mac, pc, mc, air_time);
                else
                    ob = new Commercial(mac, pc, mc, air_time, true);
            }
            default -> ob = new Advertise(0, 0, 0);
        }
        ob.printCosts();
    }
}

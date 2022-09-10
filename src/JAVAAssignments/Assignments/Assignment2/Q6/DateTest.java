package JAVAAssignments.Assignments.Assignment2.Q6;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        int m,d,y,ch;
        Date date;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date in space-separated format -  MM DD YYYY: ");
        m = Integer.parseInt(scanner.next());
        d = Integer.parseInt(scanner.next());
        y = Integer.parseInt(scanner.next());
        date = new Date(m,d,y);
        System.out.print("The initial date is: ");
        date.displayDate();
        System.out.print("Do you want to change date? if yes press 1 else 0 ");
        if(scanner.nextInt()==0)
            return;
        do {
            System.out.print("Enter 1 to change day, 2 to change month, 3 to change year: ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.print("Enter new day: ");
                    date.setDay(scanner.nextInt());
                }
                case 2 -> {
                    System.out.print("Enter new month: ");
                    date.setMonth(scanner.nextInt());
                }
                case 3 -> {
                    System.out.print("Enter new year: ");
                    date.setYear(scanner.nextInt());
                }
            }
            System.out.print("Date with new values is: ");
            date.displayDate();
            System.out.print("Do you want to change date? if yes press 1 else 0 ");
        }while (scanner.nextInt()!=0);
    }
}

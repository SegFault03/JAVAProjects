package JAVAAssignments.Assignments.Assignment2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int rand = (int) (Math.random()*100+1), guess;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 0 to 100, Press -1 to force exit: ");
        guess = scanner.nextInt();
        if(guess==-1)
            return;
        do {
           if(guess>rand)
               System.out.println("Too high, Try again!");
           else if (guess<rand) {
               System.out.println("Too low, try again!");
           }
           else {
               System.out.println("You got it correct!");
               break;
           }
            System.out.print("Guess a number between 0 to 100, Press -1 to force exit: ");
            guess = scanner.nextInt();
        }while (guess!=-1);
    }
}

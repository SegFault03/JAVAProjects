package JAVAAssignments.Assignments.Assignment11;

import java.io.File;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        File file = new File("src/JAVAAssignments/Assignments/Assignment11/Q1_util.txt");
        if (!file.exists()) {
            System.out.println("File doesn't exist!");
            return;
        }
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            fileReader.useDelimiter("\n");
        } catch (Exception e) {
            System.out.println("Failed to create Scanner object");
        }
        Scanner userInput = new Scanner(System.in);
        int c=0,marks=0;
        while (c++<3)
        {
            String question = fileReader.next();
            String o1 = fileReader.next();
            String o2 = fileReader.next();
            String o3 = fileReader.next();
            String o4 = fileReader.next();
            String ans = fileReader.next().replace('\r',' ').trim();
            System.out.print(question+"\n"+o1+"\n"+o2+"\n"+o3+"\n"+o4+"\nEnter your choice: ");
            String choice = userInput.next().toUpperCase();
            if(choice.equals(ans))
            {
                System.out.println("\nYou got that correct!");
                marks+=1;
            }
            else
            {
                System.out.println("\nOOPS! That's not the right answer! The right answer is option: "+ans);
            }
        }
        System.out.println("Your total marks is: "+marks);
    }
}

package JAVAAssignments.Assignments.Assignment11;

import java.io.File;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        File file = new File("src/JAVAAssignments/Assignments/Assignment11/Q2_util.txt");
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
        System.out.print("Enter your email: ");
        String eEmail = userInput.next();
        System.out.print("Enter your password: ");
        String ePwd = userInput.next();
        String aEmail = fileReader.next().replace('\r',' ').trim();
        String aPwd = fileReader.next().replace('\r',' ').trim();
        if(eEmail.equals(aEmail))
        {
            if(ePwd.equals(aPwd))
                System.out.println("AUTHORIZATION GRANTED!");
            else
                System.out.println("AUTHORIZATION FAILED! ENTERED INCORRECT PASSWORD!");
        }
        else
        {
            System.out.println("THAT EMAIL-ID DOES NOT EXIST!");
        }
    }
}

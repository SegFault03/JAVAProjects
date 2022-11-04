package JAVAAssignments.Tests.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\User\\Desktop\\FileTest.txt");
        String temp;
        if(file.exists())
        {
            Scanner ob = new Scanner(file);
            ob.useDelimiter("\n");
            while (ob.hasNext()) {
                temp=ob.next();
                int i=temp.indexOf(":");
                if(temp.substring(0,i).equals("data2"))
                    System.out.println(temp.substring(i+1));
            }
            FileWriter fileWriter = new FileWriter(file,true);
            fileWriter.append("\ndata5:Rajrup");
            fileWriter.close();
        }
    }
}

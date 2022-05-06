import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Program to writing in a file 

public class Program4 {
    public static void main(String args[]) {
        try {
            File file = new File("File.txt");
            Scanner input = new Scanner(file);
            while(input.hasNextLine()){
                String data = input.nextLine();
                System.out.println(data);
            }
            input.close();

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("An Error Occured");
        }
        
    }
}

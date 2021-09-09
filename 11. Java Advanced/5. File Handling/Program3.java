import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Program to writing in a file 

public class Program3 {
    public static void main(String args[]) {
        try {
            FileWriter obj = new FileWriter("File.txt");
            obj.write("This is a file created in Java");
            obj.close();
            System.out.println("File Successfully created");

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("An Error Occured");
        }
        
    }
}

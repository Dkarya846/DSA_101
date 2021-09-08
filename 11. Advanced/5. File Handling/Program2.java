import java.io.File;
import java.io.IOException;

// Program to getting information from a file 

public class Program2 {
    public static void main(String args[]) {
        File obj = new File("File.txt");
        if(obj.exists()){
            System.out.println("File Name: " + obj.getName());
            System.out.println("Absolute Path: " + obj.getAbsolutePath());
            System.out.println("Length: "+ obj.length());
            System.out.println("Can Write?: "+ obj.canWrite());
            System.out.println("Can Read?: "+ obj.canRead());
        }
        else{
            System.out.println("File already exist");
            System.out.println("Length: "+ obj.length());
        }
    }
}

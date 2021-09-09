import java.io.File;
import java.io.IOException;

// Program to create a file 

public class Program1 {
    public static void main(String args[]) {
        try{
            File obj = new File("File.txt");
            if(obj.createNewFile()){
                System.out.println("File Name: " + obj.getName());
                System.out.println("Absolute Path: " + obj.getAbsolutePath());
                System.out.println("Length: "+ obj.length());
            }
            else{
                System.out.println("File already exist");
                System.out.println("Length: "+ obj.length());
            }
        }
        catch(IOException e){
            System.out.println("An Error Occured: "+ e.getMessage());
        }
    }
}

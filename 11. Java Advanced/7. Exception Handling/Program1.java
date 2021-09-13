import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program1 {
    public static void main(String args[]){
        try{
            Scanner input = new Scanner(new File("text.txt"));
            System.out.println(input.nextLine());
        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }

        finally{
            System.out.println("Finally Block");
        }
        System.out.println("After Try Catch");
    }
}

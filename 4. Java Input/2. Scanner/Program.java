import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = input.nextLine();
        System.out.println("Entered String is: "+str);

        System.out.print("Enter a Number: ");
        int a = input.nextInt();
        System.out.println("Entered Integer is: "+a);

        System.out.print("Enter a Float Number: ");
        float f = input.nextFloat();
        System.out.println("Entered Integer is: "+f);

        input.close();
    }
}

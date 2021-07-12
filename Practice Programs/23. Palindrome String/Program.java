import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        System.out.println("String: " + string);
        System.out.println("Reverse of String: " + reverseString(string));
    }    

    public static String reverseString(String string){
        String temp = "";
        for(int i = string.length() - 1; i >= 0 ; i--){
            temp += string.charAt(i);
        }

        return temp;
    }
}

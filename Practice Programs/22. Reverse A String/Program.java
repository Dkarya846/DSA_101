import java.util.Scanner;

import javax.sound.sampled.BooleanControl;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        if(isPalindrome(string)){
            System.out.println("Yes");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }    

    public static boolean isPalindrome(String string){
        int start = 0;
        int end = string.length() - 1;
        while(start <= end){
            if(string.charAt(start) != string.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static String reverseString(String string){
        String temp = "";
        for(int i = string.length() - 1; i >= 0 ; i--){
            temp += string.charAt(i);
        }

        return temp;
    }
}

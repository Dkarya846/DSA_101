import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        System.out.println("Last Digit of "+num+" is: "+getFirstDigitWithLog(num));
        input.close();
    }

    public static int getFirstDigit(int num){
        while(num>10){
            num /= 10;
        }
        return num;
    }

    public static int getFirstDigitWithLog(int num){
        int power = (int) Math.log10(num);
        return (int)(num / Math.pow(10, power));
    }

    
}
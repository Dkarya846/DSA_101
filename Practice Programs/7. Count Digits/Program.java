import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int n = number;
        int count = 0;
        while(n > 0){
            n /= 10;
            count++;
        }

        System.out.println("Total Digits in "+number+" are: "+count);
        input.close();
    }
}
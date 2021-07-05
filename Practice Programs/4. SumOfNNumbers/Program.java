import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = (int)(n*(n+1))/2;
        System.out.println("Sum of first "+n+" natural number is: "+sum);
        input.close();
    }
}
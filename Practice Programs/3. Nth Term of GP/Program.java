import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of r: ");
        int r = input.nextInt();
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        int nthTerm = a * (int)Math.pow(r, n-1);
        System.out.println(n+"th term of GP is: "+nthTerm);
        input.close();
    }
}

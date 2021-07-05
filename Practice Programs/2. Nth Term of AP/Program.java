import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of d: ");
        int d = input.nextInt();
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        int al = a + (n-1)*d;
        System.out.println(n+"th term is: "+al);
        input.close();
    }
}

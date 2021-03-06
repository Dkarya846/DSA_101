import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value to a: ");
        int a = input.nextInt();

        System.out.print("Enter value to b: ");
        int b = input.nextInt();
        
        int gcd = gcdBruteForce(a, b);
        System.out.println("GCD of "+a+" and "+b+" is "+ gcd );
    }
    
    static int gcdBruteForce(int a, int b){
        int min = a < b ? a: b;
        int gcd = 0;
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i ==0)
                gcd = i; 
        }

        return gcd;
    }

    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }

        return gcd(b, a % b);
    }
}

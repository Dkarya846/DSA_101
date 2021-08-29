import java.math.BigInteger;
import java.util.*;

public class Prime {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.println( "is "+a+ " a prime Number: "+(prime(a) ? "Yes": "False"));
        System.out.println( "Next prime Number is: "+nextPrime(a));
        input.close();
    }

    public static boolean prime(int n){
        BigInteger a = BigInteger.valueOf(n);
        return a.isProbablePrime(1);
    }


    public static int nextPrime(int n){
        BigInteger a = BigInteger.valueOf(n);
        return Integer.parseInt(a.nextProbablePrime().toString());
    }
}

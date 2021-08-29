import java.math.BigInteger;
import java.util.*;

public class Fibonacci {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.println( a+"th Fibonacci Number is "+fib(a));
        input.close();
    }

    public static BigInteger fib(int n){
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");

        if(n == 1) return a;
        BigInteger c = new BigInteger("0");
        for(int i = 3; i <= n; i++){
            c = a.add(b);
            a = b;
            b = c;
        }
        return b;
    }
}

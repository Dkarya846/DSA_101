import java.math.BigInteger;
import java.util.*;

public class Factorial {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.println("Factorial of "+a+" is "+factorial(a));
    }

    public static BigInteger factorial(int n){
        BigInteger f = new BigInteger("1");
        
        for(int i = 2; i <= n; i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}

import java.util.Scanner;

public class Program {

    static boolean  isPrime(int n){
        if (n == 1){
            return false;
        }
        else if(n == 2 || n == 3){
            return true;
        }
        else if(n % 2 == 0 || n % 3 == 0){
            return false;
        }
        for(int i = 5; i*i < n; i+=6){            
            if(n % i == 0 && n % (i+2) == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = input.nextInt();
        input.close();
        boolean isPrimeNumber = Program.isPrime(n);
        
        String result = isPrimeNumber == true ? "a Prime Number": "Not a prime";
        System.out.println(n+ " is "+result);
        
    }
}

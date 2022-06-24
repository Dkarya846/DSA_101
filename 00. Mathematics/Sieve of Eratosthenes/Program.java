import java.util.Scanner;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();

        printAllPrimeOptimized(num);
    }

    public static void printAllPrime(int num){
        // This problem can be solved using Sieve of Eratothenes
        boolean isPrime[] = new boolean[num + 1];
        Arrays.fill(isPrime, true);

        for(int i = 2; i*i <= num; i++){
            if(isPrime[i]){
                for(int j = 2 * i; j <= num; j += i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i = 2; i <= num; i++){
            if(isPrime[i] == true)
                System.out.print(i + " ");
        }


        System.out.println();


    }

    public static void printAllPrimeOptimized(int num){
        // This problem can be solved using Sieve of Eratothenes
        boolean isPrime[] = new boolean[num + 1];
        Arrays.fill(isPrime, true);

        for(int i = 2; i <= num; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
                for(int j = i * i; j <= num; j += i){
                    isPrime[j] = false;
                }
            }
        }

        System.out.println();


    }

}

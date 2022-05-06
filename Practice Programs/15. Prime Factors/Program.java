import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();

        System.out.printf("Prime Factors of %d are: \n", num);
        printPrimeFactors(num);
        System.out.println();
        primeNums(num);
    }

    public static void printPrimeFactors(int num){
        for(int i = 2; i*i <= num; i++){
            while(num % i == 0){
                System.out.print(i + " ");
                num /= i;
            }
        }
        if(num > 1)
            System.out.print(num);

    }


    public static void printPrimeFactorsBF(int num){
        int i = 2;
        int tempNum = num;
        while(tempNum > 1){
            if(isPrime(i) && tempNum % i ==0){
                System.out.print(i + " ");
                tempNum /= i;
            }
            else
                i += 1;
        }
    }

    public static int getFirstDigit(int num){
        while(num>10){
            num /= 10;
        }
        return num;
    }

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
    
    static void  primeNums(int n){
        for(int i = 0; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
}
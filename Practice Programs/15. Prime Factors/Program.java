import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();

        int i = 2;
        int tempNum = num;
        System.out.printf("Prime Factors of %d are: \n", num);
        while(tempNum > 1){
            if(isPrime(i) && tempNum % i ==0){
                System.out.print(i + " ");
                tempNum /= i;
            }
            else
                i += 1;
        }
        System.out.println();
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
    
}
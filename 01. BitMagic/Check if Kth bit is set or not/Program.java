import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.print("Enter the value of k: ");
        int k = input.nextInt();
        checkSetBitRight(n, k);

    }    

    public static void checkSetBitLeft(int n, int k){
        int shifted = 1 << (k - 1);
        if((n & shifted) != 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }

    public static void checkSetBitRight(int n, int k){
        if(((n >> (k - 1)) & 1) == 1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}

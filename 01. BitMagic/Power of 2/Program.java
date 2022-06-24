import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println(isPowerOf2(n) ? "Yes" : "No");
    }   

    public static boolean isPowerOf2(int n){
        if(n == 0){
            return false;
        }

        // n = 10, n = 8
        // n - 1 = 9, n = 8 - 1

        // n &  (n - 1) is 10 & 9 = 1 ( 1010  & 1001)  and 8 & 7  = 0 (1000 & 0111)

        // n & (n - 1) if a number is power of two then this expression will result 0.
        return (n & (n -1)) == 0;
    }
    
}

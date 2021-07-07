import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = input.nextInt();
        input.close();

        int nOStar;
        int nOSpace;
        for(int i = 1; i <= n; i++){
            nOStar = 2*i - 1;
            nOSpace = n - i;

            for(int j = 1; j <= nOSpace; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= nOStar; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        
    }
}

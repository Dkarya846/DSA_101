import java.util.Scanner;

// Mathematics.Trailing Zero in Factorial;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        // long fact = 1; 

        // for(int i = n; i > 0; i--){
        //     fact *= i;
        // }
        // int zeros = 0;
        // while(fact % 10 == 0){
        //     zeros++;
        //     fact /= 10;
        // }
        int zeros = 0;
        for(int i = 5; i <= n; i *= 5){
            zeros += n / i;
        }

        System.out.println(zeros);
        input.close();

    }
}

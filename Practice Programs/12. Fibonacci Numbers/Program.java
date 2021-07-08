import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();
        
        int a = 1, b = 1;
        int fib = 0;
        if(n == 0)
            System.out.println(a);
        else if(n == 1){
            System.out.println(b);
        }
        else{
            System.out.print(a + " ");
            System.out.print(b + " ");

            for(int i = 2; i <= n; i++){
                fib = a+b;
                System.out.print(fib + " ");
                a = b;
                b = fib;
            }
            System.out.println();
        }

    }
}

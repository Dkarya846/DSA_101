import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        try {
            methodA();
            System.out.println("Exit the main method");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            e.printStackTrace();
        }
        System.out.println("Exit main successfully");
    }

    static void methodA() throws ArithmeticException{
        int a = 10, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer value for b: ");
        b = input.nextInt();
        input.close();
        
        if(b == 0){
            throw new ArithmeticException();
        }
        int c = a / b;
        System.out.println(c);
    }
}

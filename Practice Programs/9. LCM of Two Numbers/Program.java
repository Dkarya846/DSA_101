import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value to a: ");
        int a = input.nextInt();

        System.out.print("Enter value to b: ");
        int b = input.nextInt();
        int max = a > b ? a: b;
        int lcm = 0;
        for(int i = max; i <= a * b; i++){
            if(i % a == 0 && i % b == 0){
                lcm = i; 
                break;
            }
        }

        System.out.println("LCM of "+a+" and "+b+" is "+lcm );
    }
}

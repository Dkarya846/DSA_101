import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int a = input.nextInt();

        System.out.print("Enter Second number: ");
        int b = input.nextInt();

        System.out.print("Enter Third number: ");
        int c = input.nextInt();

        int largest;

        if( a >= b && a >= c){
                largest = a;
        }
        else if(b >= c && b >= a){
            largest = b;
        }
        else{
            largest = c;
        }
        System.out.println("Largest Number is " + largest);
        input.close();
    }
}
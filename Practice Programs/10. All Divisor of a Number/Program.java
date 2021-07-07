import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        int i;
        for(i = 1; i*i < number; i++){
            if(number % i == 0){
                System.out.print(i+" ");
            }
        }
        for(i=(int)Math.sqrt(number); i >= 1; i--){
            if(number % i == 0){
                System.out.print(number/i+" ");
            }
        }
        System.out.println();
        
    }
}

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        System.out.println(decToBinary(number));
        
    }    

    public static String decToBinary(int number){
        String binary = "";
        while(number > 0){
            binary = (number%2)+binary;
            number /= 2;
        }
        if(number == 0){
            return "0";
        }

        return binary;
    }
}

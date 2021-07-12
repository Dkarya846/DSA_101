import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in binary: ");
        String binary = input.nextLine();
        input.close();
        System.out.println(binToDeci(binary));
    }    

    public static int binToDec(String binary){
        int number = 0;
        for(int i = binary.length() - 1, j = 0; i >= 0; i--, j++){
            number += Math.pow(2, i) * (binary.charAt(j)- '0');
        }
        return number;
    }

    public static int binToDeci(String binary){
        int deci = 0;
        for(int i = binary.length() - 1,j = 1; i >= 0; i--, j*=2){
            deci += (binary.charAt(i)-'0') * j;
        }
        return deci;
    }
}

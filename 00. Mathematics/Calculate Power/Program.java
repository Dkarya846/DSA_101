import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Enter Power: ");
        int pow = input.nextInt();
        int result = calPower(num, pow);
        input.close();

        System.out.println(result);
    }    

    public static int calPower(int num, int pow){
        if(pow == 0){
            return 1; 
        }

        if(pow == 1){
            return num;
        }

        if(pow % 2 != 0 ){
            System.out.println(Math.round((float)pow/2));
            return calPower(num, pow / 2 + 1) * calPower(num, pow / 2);
        }

        return calPower(num, pow / 2) * calPower(num, pow / 2);
    }

    public static int calPowerIterative(int num, int pow){
        int x = 1, res = 1;
        return 0;
    }
}
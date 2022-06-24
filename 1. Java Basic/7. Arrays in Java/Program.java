import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        System.out.print("Enter the size of Array: ");
        int []arr = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;
        arr[4] = 25;

        System.out.print("Elements of Array are: \n");
        for(int item : arr){
            System.out.print(item + "\t");
        }
        System.out.print("\n");

    }
}

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        System.out.print("Enter the size of Array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int []arr = new int[size];
        System.out.print("Enter the elements of Array: ");
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        input.close();
        for(int item : arr){
            sum += item; 
        }
        System.out.print("Sum of the Array is: " + sum + "\n");
    }
}

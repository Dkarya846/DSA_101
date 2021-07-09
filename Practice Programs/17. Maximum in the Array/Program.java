import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        System.out.print("Enter the size of Array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int []arr = new int[size];
        System.out.print("Enter the elements of Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        input.close();
        int max = arr[0];
        for(int item : arr){
            if(item > max)
                max = item; 
        }
        System.out.print("Maxium number in the Array is: " + max + "\n");
    }
}

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
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(!search(arr, i - 1, arr[i])){
                count++;
            }
        }
        System.out.print("Distictive number in of elements in the Array is: " + count + "\n");
    }

    public static boolean search(int arr[], int len, int elem){
        for(int i = 0; i <= len; i++){
            if(arr[i] == elem){
                return true;
            }
        }
        return false;
    }
}

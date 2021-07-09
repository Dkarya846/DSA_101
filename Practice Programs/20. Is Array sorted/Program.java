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
        boolean isSorted = true;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted ? "Yes" : "No");
    }

}

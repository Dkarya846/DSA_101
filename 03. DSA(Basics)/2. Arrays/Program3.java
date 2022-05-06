//Program for checking if an array is sorted or not

public class Program3 {
    public static void main(String  args[]){
        int arr [] = {1,2,3,4,5,6,8,7};
        System.out.println(isSorted(arr, arr.length));
    }

    public static String isSorted(int arr[], int n){
        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                return "No";            
            } 
        }
        return "Yes";
    }
}

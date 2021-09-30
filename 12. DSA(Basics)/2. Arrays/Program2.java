//Largest element of an array
public class Program2 {
    public static void main(String args[]){
        int arr [] = {5,10,30,20,15, 45};

        int largest = getLargest(arr, arr.length);;
        
        System.out.println(largest);

    }

    public static int getLargest(int arr[], int n){
        int largest = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[largest] < arr[i]){
                largest = i;
            }
        }

        return largest;

    }

}

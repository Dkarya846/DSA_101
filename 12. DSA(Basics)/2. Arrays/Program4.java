//2nd Largest element of an array
public class Program4{
    public static void main(String args[]){
        int arr [] = {1,2,4,6,5, 10};

        int secondlargest = getEffSecondLargest(arr, arr.length);;
        
        System.out.println(secondlargest);

    }

    public static int getSecondLargest(int arr[], int n){
        int largest = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[largest] < arr[i]){
                largest = i;
            }
        }

        int secondLargest = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[secondLargest] < arr[i] && arr[i] < arr[largest]){
                secondLargest = i;
            }
        }

        return secondLargest;

    }

    public static int getEffSecondLargest(int arr[], int n){
        int largest = 0;
        int secondLargest = -1;

        for(int i = 1; i < n; i++){
            if(arr[largest] < arr[i]){
                secondLargest = largest;
                largest = i;
            }
            else if(arr[largest] > arr[i]){
                if(secondLargest == -1 || arr[i] > arr[secondLargest]){
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }

}

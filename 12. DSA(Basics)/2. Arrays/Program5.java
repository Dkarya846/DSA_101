// Program to remove duplicates from Sorted array 

public class Program5 {
    public static void main(String args[]){
        int arr [] = {1,1,1,1,1,1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5};

        int newSize = removeDuplicate(arr, arr.length);

        for(int i = 0; i < newSize; i++){
            System.out.println(arr[i]);
        }
    }

    public static int removeDuplicateNaive(int arr[], int size){
        int temp[] = new int[size];
        temp[0] = arr[0];
        int res = 1;

        for(int i = 1; i < size; i++){
            if(temp[res-1] != arr[i]){
                temp[res]=arr[i];
                res++;
            }
        }

        for(int i = 0; i < res; i++){
            arr[i] = temp[i];
        }

        return res;
    }

    public static int removeDuplicate(int arr[], int size){
        // int res = 1;
        // for(int i = 1; i < size ; i++){
        //     if(arr[res-1] != arr[i]){
        //         arr[res] = arr[i];
        //         res++;
        //     }
        // }

        int res = 1;
        for(int i = 1; i < size; i++){
            if(arr[res-1] != arr[i]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;

    }
}

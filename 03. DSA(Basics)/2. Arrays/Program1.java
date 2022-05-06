public class Program1{
    public static void main(String []args){
        int arr [] = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        int n = insert(arr, 3, 13, arr.length,  2);
        n = insert(arr, n, 26, arr.length,  2);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int arr2 [] = {5,10,30,20,15};


        n = delete(arr2, 5, 30);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("");
    }

    static int insert(int arr[], int n, int x, int cap, int pos){
        if(n == cap){
            return n;
        }
        int index = pos - 1;

        for(int i = n - 1; i >= index; i--){
            arr[i+1] = arr[i];
        }

        arr[index] = x;

        return n+1;
    }

    static int delete(int arr[],int n, int k){
        int index = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == k){
                index = i;
                break;
            }
        }

        if(index == n){
            return n;
            }

        for(int i = index; i< n-1; i++){
            arr[i] = arr[i+1];
        }

        return n - 1;
    }
}
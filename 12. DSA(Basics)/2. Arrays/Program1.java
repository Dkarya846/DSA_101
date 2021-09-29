public class Program1{
    public static void main(String []args){
        int arr [] = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        int n = insert(arr, 3, 13, arr.length,  2);
        n = insert(arr, n, 26, arr.length,  2);
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
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
}
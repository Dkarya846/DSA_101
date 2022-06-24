public class Program{
   public static void main(String[] args) {
      int arr[] = {8,7,7,8,8};
      int result = onlyOdd(arr);

      System.out.println(result);
   }

   public static int onlyOdd(int arr[]){
      int result = arr[0];
      for(int i = 1; i < arr.length; i++){
         result ^= arr[i];
      }

      return result;
   }
}
public class Program{
   public static void main(String[] args) {
      int n = 5;
      int arr[] = {1,2,3,4};
      int result = findMissing(arr, n);

      System.out.println(result);
   }

   public static int findMissing(int arr[], int range){
      int result = arr[0];
      for(int i = 1; i < arr.length; i++){
         result ^= arr[i];
      }
      for(int i = 1; i <= range; i++){
         result ^= i;
      }

      return result;
   }
}
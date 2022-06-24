public class Program{
   public static void main(String[] args) {
      int arr[] = {4,4,5,4,4,6,7, 7};
      twoOdd(arr);

   }

   public static void twoOdd(int arr[]){
      int result = arr[0];

      // calculating xor of all the numbers
      for(int i = 1; i < arr.length; i++){
         result ^= arr[i];
      }

      // 
      int rightSetBit = result & ~(result - 1);

      int num1 = 0, num2 = 0;

      for(int i = 0; i < arr.length; i++){
         if((arr[i] & rightSetBit) != 0){
            num1 ^= arr[i];
         }else{
            num2 ^= arr[i];
         }
      }

      System.out.println(num1+ " " + num2);

   }
}
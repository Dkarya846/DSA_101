
public class Program {
   public static void main(String[] args) {
      String s = "ab";
      int n = s.length();
      int totalElem = (int)Math.pow(2, n);

      for(int counter = 0; counter < totalElem; counter++){
         for(int j = 0; j < n; j++){
            if((counter & (1 << j)) != 0)
               System.out.print(s.charAt(j));
         }

         System.out.println();
      }

   }
}

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int count = CountSet(n);

        System.out.println(count);
    }
    public static int CountSetNaive(int n){
        int count = 0;
        while(n > 0){
            if(n % 2 == 1){
                count++;
            }
            n /= 2;
        }

        return count;
    }
    public static int CountSetBK(int n){
        int res = 0;
        while(n > 0){
            n = n & (n - 1);
            res++;
        }

        return res;
    }

    public static int CountSet(int n){
        
        //pre processing
        int table[] = new int[256];
        for(int i = 0; i < 256;i++){
            table[i] = (i & 1) + table[i / 2];
        }
        int res = 0;
        
        // counting 1's in first chunk
        res += table[n & 0xff];
        n = n >> 8;

        // counting 1's in second chunk
        res += table[n & 0xff];
        n = n >> 8;

        // counting 1's in third chunk
        res += table[n & 0xff];
        n = n >> 8;

        // counting 1's in fourth chunk 
        res += table[n & 0xff];
        n = n >> 8;

        return res;
    }
}

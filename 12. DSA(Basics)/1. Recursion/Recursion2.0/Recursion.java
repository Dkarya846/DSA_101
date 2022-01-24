public class Recursion {
    public static void printNumb(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        printNumb(n - 1);
    }

    public static void printNum(int n){
        if(n > 5)
            return;
        System.out.println(n);
        printNum(n+1);
    }

    public static void printSum(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1 , n, sum);
    }

    public static int calcFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int factnm1 = calcFactorial(n-1);
        int fact = n * factnm1;
        return fact;
    }

    public static void printFib(int a, int b, int n){
        if(n == 0){
            return;
        }

        int c = a + b;
        System.out.println(c);
        printFib(b, c, n-1);
    }

    public static int calPower(int x, int n){
        if(n == 0)      //}
            return 1;   //} //base case
        if(x == 0)      //}
            return 0;

        return x * calPower(x, n - 1); //recursion
    }
    public static void main(String args[]){
        int n = 5;
        printNumb(n);
        System.out.println();
        printNum(1);


        System.out.println("Sum of N");
        printSum(1, 5, 0);

        System.out.print("Fact of 5: ");
        int ans = calcFactorial(5);
        System.out.println(ans);


        System.out.println("Printing fibonacci Sequence: ");
        int a = 0, b = 1, num = 7;
        System.out.println(a);
        System.out.println(b);
        printFib(a, b, num - 2);

        System.out.print("Calculating 5^3: ");
        ans = calPower(5, 3);
        System.out.println(ans);
    }    
}

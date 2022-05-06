import java.util.HashSet;

public class RecursionBasic {

    // Print n to 1
    public static void printNumb(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        printNumb(n - 1);
    }

    //Print 1 to n
    public static void printNum(int n){
        if(n > 5)
            return;
        System.out.println(n);
        printNum(n+1);
    }

    // Print Sum of 1 to n 
    public static void printSum(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1 , n, sum);
    }

    // Print Factorial of n 
    public static int calcFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int factnm1 = calcFactorial(n-1);
        int fact = n * factnm1;
        return fact;
    }

    // Print n fibonacci sequence 
    public static void printFib(int a, int b, int n){
        if(n == 0){
            return;
        }

        int c = a + b;
        System.out.println(c);
        printFib(b, c, n-1);
    }

    //Calculate x**n with stack height n 
    public static int calPower(int x, int n){
        if(n == 0)      //}
            return 1;   //} //base case
        if(x == 0)      //}
            return 0;

        return x * calPower(x, n - 1); //recursion
    }

    //Calculate x**n with stack height logn 
    public static int calPower2(int x, int n){
        if(n == 0)      //}
            return 1;   //} //base case
        if(x == 0)      //}
            return 0;

        //if x is even
        if(x % 2 == 0){
            return calPower2(x, n / 2) * calPower2(x, n / 2); //recursion
        }
        else{ //if x is odd
            return calPower2(x, n / 2) * calPower2(x, n / 2) * x;
        }
    }

    public static void main(String args[]){
        // For print 5 to 1
        // int n = 5;
        // printNumb(n);
        // System.out.println();
        // printNum(1);

        // for printing 1 to 5
        // System.out.println("Sum of N");
        // printSum(1, 5, 0);

        // for printing factorial of 5
        // System.out.print("Fact of 5: ");
        // int ans = calcFactorial(5);
        // System.out.println(ans);


        //For printing n fibonacci sequence  
        // System.out.println("Printing fibonacci Sequence: ");
        // int a = 0, b = 1, num = 7;
        // System.out.println(a);
        // System.out.println(b);
        // printFib(a, b, num - 2);

        //Calculating power n of x with stack height x 
        // System.out.print("Calculating 5^3: ");
        // ans = calPower(5, 3);
        // System.out.println(ans);


        //Calculating power n of x with stack height log n
        // System.out.print("Calculating 5^3: ");
        // ans = calPower2(5, 3);
        // System.out.println(ans);

    }    
}

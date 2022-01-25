import java.util.HashSet;

public class Recursion {
    public static int first = -1;
    public static int last = -1;
    public static boolean map[] = new boolean[26]; 
    public static String keyboard[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

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

    //Tower of Hanoi
    public static void towerOfHanoi(int n, String src, String helper, String dest){

        if(n == 1){
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        //Moving n-1 disks to helper from source
        towerOfHanoi(n - 1, src, dest, helper);

        //Transfer nth disk from source to destination
        System.out.println("Transfer disk " + n + " from ");

        //moving n-1 disks to helper from source
        towerOfHanoi(n - 1, helper, src, dest);
    }

    //Printing reverse of a string
    public static void printReverse(String s, int idx){
        if( idx < 0){
            return;
        }

        //Printing idxth character
        System.out.print(s.charAt(idx));
        printReverse(s, idx - 1);
    }

    // Finding first and last occurance of a character in string 
    public static void findOccurance(String s, int idx, char elem){
        if(idx == s.length()){
            System.out.println("First Occurance: "+first);
            System.out.println("Last Occurance: "+last);
            return;
        }
        if(s.charAt(idx) == elem){
            if(first == -1){
                first = idx;
                last = idx;
            }else{
                last = idx;
            }
        }
        findOccurance(s, idx + 1, elem);
    }

    //Print is array sorted or not
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length - 1)
            return true;

        if(arr[idx] >= arr[idx + 1])
            return false;

        return isSorted(arr, idx + 1);
    }
    
    //Moving all x to the end
    public static String moveAllX(String str, String newStr, int index,  int count){
        if(index == str.length()){
            for(int i = 0; i < count; i++){
                newStr += 'x';
            }
            return newStr;
        }

        if(str.charAt(index) == 'x'){
            count++;
            return moveAllX(str, newStr, index + 1, count);
        }
        else{
            return moveAllX(str, newStr+str.charAt(index), index + 1, count);
        }
            
    }


    //Removing Duplicates
    public static void removeDuplicates(String str, int idx, String newStr){
        //base case
        if(str.length() == idx){
            System.out.println(newStr);
            return;
        }

        int index = str.charAt(idx) - 'a';
        if(map[index] == false){
            newStr += str.charAt(idx);
            map[index] = true;

        }
        removeDuplicates(str, idx + 1, newStr);

    }

    //Printing all the subsequence of a string
    public static void subsequences(String str, String newStr, int idx){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        //to be
        subsequences(str, newStr + currChar, idx + 1);
        //not to be
        subsequences(str, newStr, idx + 1);
    }
    
    //Printing all the subsequence of a string uniquely
    public static void subsequences(String str, String newStr, int idx, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newStr)){
                return;
            }
            System.out.println(newStr);
            set.add(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        //to be
        subsequences(str, newStr + currChar, idx + 1, set);
        //not to be
        subsequences(str, newStr, idx + 1, set);
    }
    
    // Print key combination

    public static void keyCombination(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
    
        char currKey = str.charAt(idx);
        String keyPressed = keyboard[currKey - '0'];
        for(int i = 0; i < keyPressed.length(); i++){
            keyCombination(str, idx + 1, combination + keyPressed.charAt(i));
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

        // Print Steps to solve tower of hanoi 
        // int n = 64;
        // towerOfHanoi(n, "S", "H", "D");

        //Reversing a string
        // String s = "abcd";
        // int idx = s.length();
        // printReverse(s, idx - 1);
        // System.out.println();

        //Printing first and last occurance
        // String string = "abaacdaefaah";
        // findOccurance(string, 0, 'a');

        // Print is array Sorted 
        // int arr[] = {1,2,3,4,5};
        // System.out.println(isSorted(arr, 0));

        // Moving all x to end 
        // String string = "axbcxxd";
        // String newStr = moveAllX(string, "", 0, 0);
        // System.out.println(newStr);


        // Removing Duplicates 
        // String str = "aaaaaaaaabbbbbbbbbbbbbbbccccccccccc";
        // removeDuplicates(str, 0, "");


        // Print all the subsequence of a string 
        // String str = "abc";
        // subsequences(str, "", 0);

        // Print all the subsequence of a string uniquely
        // String str = "aaa";
        // HashSet<String> set = new HashSet<String>();
        // subsequences(str, "", 0, set);

        // Print key combination 
        String str = "2";
        keyCombination(str, 0, "");

    }    
}

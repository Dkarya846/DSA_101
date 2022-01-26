import java.util.HashSet;

public class RecursionMedium {
    public static int first = -1;
    public static int last = -1;
    public static boolean map[] = new boolean[26]; 
    public static String keyboard[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    
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
    
    public static void main(String[] args) {
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

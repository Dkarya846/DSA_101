import java.util.ArrayList;

public class RecursionAdvance {

    //Print all permutation of a string
    public static void printPer(String str, String permutation){
        //base case
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char curChar = str.charAt(i);
            //abc -> bc
            String newString = str.substring(0 , i) + str.substring(i+1);

            //next permutaion for bc
            printPer(newString, permutation + curChar);
        }
    }
    
    //Total paths in a maze to move from 00 to m,n 
    public static int countPaths(int i, int j, int m, int n){
        if(i == m || j == n){
            return 0;
        }
        if(i == m-1 && j == n-1){
            return 1;
        }
        //move right
        int rightPaths = countPaths(i + 1, j, m, n);

        //move down
        int downPaths = countPaths(i, j + 1, m, n);

        // Total paths 
        return  rightPaths + downPaths;
    }

    // Number of ways tiles can be placed on n * m sized floor and 1 * m sized tiles
    public static int placeTiles(int n, int m){
        //when n == m we have only two ways to place tiles
        if(n == m){
            return 2;
        }

        //When we have n < m, we have only one way to place tiles 
        if(n < m){
            return 1;
        }

        // place vertically
        int verPlacements = placeTiles(n - m, m);

        // place hoizontally
        int horPlacements = placeTiles(n - 1, m);

        return verPlacements + horPlacements;
    }
    
    // Number of ways n guests can be invited in party (single or in pair)
    public static int callGuests(int n){
        // Base Case
        if(n <= 1){
            return 1;
        }

        //Single Guests
        int singleGuests = callGuests(n - 1);

        // Guests in Pairs 
        int pairGuests = (n - 1) * callGuests(n - 2);

        return singleGuests + pairGuests;
    }


    public static void printSet(ArrayList<Integer> subset){
        for(int i = 0; i < subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    //Print all subsets of a set of first n natural numbers
    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n == 0){
            printSet(subset);
            return;
        }

        // include n
        subset.add(n);
        findSubsets(n - 1, subset);

        //do not include n
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);

    }

    public static void main(String[] args) {
        // Print all permutation of a string
        // String str = "abc";
        // printPer(str, "");
        
        //Total paths in a maxe to move from 00 to m,n 
        // int m = 4, n = 3;
        // int totalPaths = countPaths(0, 0, m, n);
        // System.out.println("There are " + totalPaths + " from (0, 0) to (" + m +", "+ n +")");
        
        // Number of ways tiles can be placed on n * m sized floor and 1 * m sized tiles
        // int n = 4, m = 2;
        // System.out.println(placeTiles(n, m)); 

        // Number of ways n guests can be invited in party (single or in pair)
        // int noOfGuests = 4;
        // System.out.println(callGuests(noOfGuests));

        int n = 3;
        ArrayList<Integer> subset = new ArrayList<Integer>();
        findSubsets(n, subset);
    }
}

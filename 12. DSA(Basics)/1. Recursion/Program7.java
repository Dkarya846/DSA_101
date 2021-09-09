// Program for Subset of a string using recursion
public class Program7 {
    static void printSubset(String str, String current, int index){
        if(str.length() == index){
            System.out.print("\""+current + "\"" + " ");
            return;
        }

        printSubset(str, current, index+1);
        printSubset(str, current + str.charAt(index), index+1);
    }

    public static void main(String args[]){
        String str = "ABC";
        printSubset(str, "", 0);
        System.out.println();
    }
    
}

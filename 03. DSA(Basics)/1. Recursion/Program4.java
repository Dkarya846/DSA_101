// Program for checking a palindrome string 
public class Program4 {

    // static boolean checkPalin(String str, int i, int n) {
    //     if (i > n) {
    //         return true;
    //     }
    //     if (str.charAt(i) == str.charAt(n)) {
    //         return checkPalin(str, i + 1, n - 1);
    //     }
    //     return false;
    // }

    static boolean checkPalin(String str, int i, int n) {
        if (i >= n) {
            return true;
        }
        
        // Using a feature is called short circuiting
        return (str.charAt(i) == str.charAt(n)) && checkPalin(str, i + 1, n - 1);
        
    }

    public static void main(String args[]) {
        String str = "abba";
        System.out.println(checkPalin(str, 0, str.length() - 1) ? "Yes" : "No");
    }
}

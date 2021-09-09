//Program for Calculating Sum of n Natural numbers
public class Program3 {
    public static int sumOfNaturals(int n, int k){
        if(n == 0){
            return k;
        }
        return sumOfNaturals(n-1, k+n);
    }
    public static void main(String args[]){
        System.out.println(sumOfNaturals(5, 0));
    }
}

import java.util.HashSet;
import java.util.Arrays;

public class Program {
    public static void main(String args[]){
        Integer arr[] = {1, 2, 3,2,3,4,4, 5};
        System.out.println(countDistinct(arr));
    }

    static int   countDistinct(int arr[]){
        HashSet<Integer> h = new HashSet<Integer>();
        for (int item : arr) {
            h.add(item);
        }
        return h.size();
    }

    static int  countDistinct(Integer arr[]){
        HashSet<Integer> items = new HashSet<Integer>(Arrays.asList(arr));
        return items.size();       
    }
}

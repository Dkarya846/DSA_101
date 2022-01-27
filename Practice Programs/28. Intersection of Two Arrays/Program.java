import java.util.HashSet;

public class Program {
    public static int intersectionCount(int a[], int b[]){
        HashSet<Integer> aSet = new HashSet<Integer>();
        HashSet<Integer> bSet = new HashSet<Integer>();

        for(int i: a){
            aSet.add(i);
        }

        for(int i: b){
            bSet.add(i);
        }

        int count = 0;
        for(Integer i: aSet){
            if(bSet.contains(i)){
                count++;
            }
        }

        return count;
    }   

    public static int intersectionCount2(int a[], int b[]){
        HashSet<Integer> aSet = new HashSet<Integer>();

        for(int i: a){
            aSet.add(i);
        }

        int count = 0;
        for(int i: b){
            if(aSet.contains(i)){
                count++;
                aSet.remove(i);
            }
        }

        return count;
    }   
    
    public static void main(String[] args) {
        int a[] = {10, 15, 20, 5, 30};
        int b[] = {30, 5, 30, 80};

        System.out.print("Method 1: ");
        int count = intersectionCount(a, b);
        System.out.println(count);

        System.out.print("Method 2: ");
        count = intersectionCount(a, b);
        System.out.println(count);
    }
}

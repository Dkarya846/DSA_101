import java.util.HashSet;
import java.util.Iterator;

// Program to illustrate HashSet 
public class Program3 {
    public static void main(String args[]){
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("GFG");
        hashSet.add("DSA");
        hashSet.add("Hashing");
        hashSet.add("Hash");

        for(String s : hashSet){
            System.out.println(s);
        }
        
        System.out.println("hashSet.contains(\"GFG\") " + hashSet.contains("GFG"));
        System.out.println(hashSet.remove("GFG") + " " + hashSet);
        System.out.println("hashSet.size(): " + hashSet.size());
        System.out.println("hashSet.isEmpty() " + hashSet.isEmpty());

        Iterator<String> h = hashSet.iterator();

        System.out.println("hashSet.iterator(): ");
        while(h.hasNext()){
            System.out.println(h.next());
        }

        System.out.println("Before Clear: " + hashSet);
        hashSet.clear();
        System.out.println("after clear: " + " " + hashSet);
    }
}

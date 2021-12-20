import java.util.HashSet;

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
    }
}

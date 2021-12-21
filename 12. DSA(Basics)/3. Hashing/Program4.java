import java.util.HashMap;
import java.util.Map;

// Program to illustrate HashMap in Java 
public class Program4 {
    public static void main(String [] args){
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("GFG", 20);
        hashMap.put("HashMap", 30);
        hashMap.put("Example", 40);

        for(Map.Entry<String, Integer> entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("hashMap.containsKey(\"GFG\") " + hashMap.containsKey("GFG"));
        System.out.println("hashMap.containsValue(\"30\") " + hashMap.containsKey("30"));
        System.out.println("hashMap.get(\"GFG\") " + hashMap.get("GFG"));

        System.out.println("Before remove: " + hashMap);
        hashMap.remove("GFG");
        System.out.println("After remove: " + hashMap);

    }
}

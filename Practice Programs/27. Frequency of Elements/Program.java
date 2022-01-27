import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {

    static void printFrequency(int arr[]){
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<Integer, Integer>();
        for(int item: arr){
            // if(hashMap.containsKey(item)){
            //     hashMap.put(item, hashMap.get(item) + 1);
            // }
            // else{
            //     hashMap.put(item, 1);
            // }
            //getOrDefault is used to get a key otherwise 
            hashMap.put(item, hashMap.getOrDefault(item, 0) + 1);
        }

        // System.out.println(hashMap);
        for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String [] args){
        int arr[] = {10,12,10,15,10,20,12,12};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        printFrequency(arr);

        int arr2[] = {10,10,10,10};   
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
        printFrequency(arr2);

    }
}

import java.util.ArrayList;
import java.util.LinkedList;

class MyHash{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;

    MyHash(int b){
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i = 0; i < b; i++){
            table.add(new LinkedList<Integer>());
        }
    }

    void insert(int key){
        int index = key % BUCKET;
        table.get(index).add(key);
    }

    boolean search(int key){
        int index = key % BUCKET;
        return table.get(index).contains(key);
    }

    void remove(int key){
        int index = key % BUCKET;
        table.get(index).remove((Integer)index);
    }
}
public class Program1 {
    public static void main(String []args){
        MyHash hashTable = new MyHash(5);
        hashTable.insert(45);
        hashTable.insert(2);
        hashTable.insert(3);
        hashTable.insert(1);
        hashTable.insert(5);
        hashTable.insert(33);
        hashTable.insert(14);

        for(int i = 0; i < hashTable.table.size(); i++){
            for(int j = 0; j<hashTable.table.get(i).size(); j++)
                System.out.print(hashTable.table.get(i).get(j) + " ");
            System.out.println();
        }

        System.out.println(hashTable.search(45) ? "Item Found" : "Item Not Found");
    }
}

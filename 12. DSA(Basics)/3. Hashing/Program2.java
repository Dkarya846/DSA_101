import java.util.ArrayList;

class MyHash {
    int size, cap;
    ArrayList<Integer> table = new ArrayList<>();

    MyHash(int cap) {
        this.cap = cap;
        this.size = 0;
        for (int i = 0; i < cap; i++) {
            this.table.add(-1);
        }

    }

    int hash(int key) {
        return key % cap;
    }

    boolean insert(int key) {
        if(size == cap){
            return false; 
        }
        int i = hash(key);
        while((table.get(i) != -1) && (table.get(i) != -2) && (table.get(i) != key)){
            i = (i + 1) % cap;
        }

        if(table.get(i) == key) {
            return false;
        }
        else{
            table.set(i, key);
            size++;
            return true;
        }
    }

    boolean search(int key) {
        int h = hash(key);
        int i = h;
        while (table.get(i) != -1) {
            if (table.get(i) == key) {
                return true;
            }
            i = (i + 1) % cap;
            if (i == h)
                return false;
        }
        return false;
    }

    boolean remove(int key) {
        int i = hash(key);
        if(size == 0){
            return false;
        }
        while(table.get(i) != -1 || table.get(i) != -2){
            if(table.get(i) == key){
                table.set(i, -2);
                size--;
                return true;
            }
            i = (i+1) % cap;

            if(i == hash(key)){
                return false;
            }
        }
        return false;

    }

    void print() {
        for (int i = 0; i < cap; i++) {
            System.out.print(table.get(i) + "\t");
        }
        System.out.println();
    }

}

public class Program2 {
    public static void main(String[] args) {
        MyHash myHash = new MyHash(7);
        myHash.insert(7);
        myHash.insert(8);
        myHash.insert(9);
        myHash.print();
        myHash.insert(14);
        myHash.insert(35);
        myHash.insert(70);
        myHash.insert(7);
        myHash.print();
        myHash.remove(7);
        myHash.print();

        myHash.remove(70);
        myHash.print();
        
        // System.out.print(myHash.search(71));

    }
}

import java.util.ArrayList;

public class Program1 {
    public static void main(String []args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Below is the example of Lambda Expression in Java which is calculating square of item present in ArrayList numbers 
        numbers.forEach(item->System.out.println("Square of " + item + " is "+ item * item));
    }
}

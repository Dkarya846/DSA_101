import java.util.ArrayList;
import java.util.function.Consumer;

public class Program2 {
    public static void main(String []args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Here this Consumer is an functional interface which contains 
        // only one abstract method to hold the lambda expression
        Consumer<Integer> square = item->System.out.println("Square of " + item + " is "+ item * item);

        // Below is the example of Lambda Expression in Java which is calculating
        // square of item present in ArrayList numbers 

        numbers.forEach(square);
    }
}

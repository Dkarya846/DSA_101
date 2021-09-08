import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(10,20,30,40);
        list.forEach(Program::printSquare);
    }

    public static void printSquare(Integer x){
        System.out.println(x*x);
    }
}

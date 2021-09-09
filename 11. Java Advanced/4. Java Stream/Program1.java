import java.util.Arrays;

public class Program1 {
    public static void main(String [] args) {
        String string[] = {"abc", "cde", "acd", "aec", "xyz"};

        Arrays.stream(string)
        .filter(s->s.startsWith("a"))
        .filter(s->s.endsWith("c"))
        .sorted()
        .forEach(System.out::println);
    }
}

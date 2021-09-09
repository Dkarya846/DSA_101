interface StringFunction{
    String run(String str);
}

public class Program3 {
    public static void main(String []args){
        StringFunction exclaim = s -> s + "!";
        StringFunction ask = s -> s + "?";

        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction stringFunction){
        String result = stringFunction.run(str);
        System.out.println(result);
    }
}

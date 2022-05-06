public class Program {
    public static void main(String[] args){
        int a = 20, b = 10;
        String x = "Hello World";
        double pi = Math.PI;
        
        System.out.println(a+b); //printing number using println
        System.out.println(x);   //printing string using println
        
        System.out.println(pi);  //printing float using println

        System.out.printf("Pi: %5.2f\n", pi);  //printing float using printf
        System.out.format("Pi: %05.2f\n", pi); //printing float using format

    }
}

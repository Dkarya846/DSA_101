public class Program2 {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            e.printStackTrace();
        }
    }

    static void methodA() {
        int a = 10, b = 0;
        int c = a / b;
        System.out.println(c);
    }
}

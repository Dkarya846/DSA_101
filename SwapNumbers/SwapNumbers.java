public class SwapNumbers {
    public static void main(String [] args) {
        int a = 10, b = 20;
        System.out.println("Before Swap: \na:"+ a + " b:" + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap: \na:"+ a + " b:" + b);
    }    
}

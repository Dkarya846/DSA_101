public class AutoBoxing{
    public static void main(String[] args){
        int x1 = 10;
        Integer x2 = x1; //Autoboxing
        int x3 = x2;//Auto-Unboxing

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
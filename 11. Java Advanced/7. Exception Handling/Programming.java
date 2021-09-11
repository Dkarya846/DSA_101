public class Programming {
    public static void main(String args[]){
        int a = 20, b = 0, result = 0;

        try{
            result = a / b;
            System.out.println(result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

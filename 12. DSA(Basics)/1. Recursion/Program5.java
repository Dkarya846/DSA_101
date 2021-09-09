// Program of calculating sum of digits
public class Program5 {
    static int sumOfDigits(int n){
        if(n < 10){
            return n;
        }
        return sumOfDigits(n/10) + n%10;
    }

    public static void main(String args[]){
        System.out.println(sumOfDigits(9987));
    }
}



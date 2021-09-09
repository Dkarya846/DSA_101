import java.math.BigInteger;

public class BigIntegerEx{
    public static void main(String args[]){
        BigInteger A = new BigInteger("1564");
        BigInteger B = new BigInteger("436");

        // Methods of BigInteger

        System.out.println("A + B = "+ A.add(B));
        System.out.println("A - B = "+ A.subtract(B));
        System.out.println("A * B = "+ A.multiply(B));
        System.out.println("A / B = "+ A.divide(B));

        System.out.println("A > B = "+ A.compareTo(B));
        System.out.println("A % B = "+ A.remainder(B));
    }
}
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value to a: ");
        int a = input.nextInt();

        System.out.print("Enter value to b: ");
        int b = input.nextInt();
        int lcm = lcm(a, b);

        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
        input.close();
    }

    static int lcmBruteForce(int a, int b) {
        int max = Math.max(a, b);
        int lcm = 0;
        for (int i = max; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }

        return lcm;
    }

    static int lcm(int a, int b){
        return a*b / gcd(a, b);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}

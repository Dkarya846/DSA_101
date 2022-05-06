public class Program6 {
    public static int cutRope(int n, int a, int b, int c) {
        // base conditions
        if (n < 0)
            return -1;

        if (n == 0)
            return 0;

        //Recursive cases
        int x = cutRope(n - a, a, b, c);
        int y = cutRope(n - b, a, b, c);
        int z = cutRope(n - c, a, b, c);

        int res = Integer.max(Integer.max(x, y), z);
        if (res == -1)
            return -1;
        return res + 1;
    }

    public static void main(String args[]) {
        int n = 5, a = 2, b = 1, c = 5;
        System.out.println(cutRope(n, a, b, c));
    }
}
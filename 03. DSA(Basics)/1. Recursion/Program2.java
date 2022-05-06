// Program to print n to 1 using recursion

public class Program2 {
    public static void fun(int n){
        if(n<1)
            return;
        System.out.print(n+" ");
        fun(n-1);
    }

// Program to print 1 to n using recursion
    public static void fun2(int n){
        if(n==0)
            return;
        fun2(n-1);
        System.out.print(n + " ");
    }

    public static void main(String args[]){
        fun(5);
        System.out.println();
        fun2(5);
        System.out.println();
    }
}

/*
for fun(5)
Output:
5
4
3
2
1
*/
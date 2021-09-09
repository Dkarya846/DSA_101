public class Program1 {
    public static void fun(int n){
        if(n==0)
            return;
        fun(n-1);
        System.out.println(n);
        fun(n-1);
    }
    public static void main(String args[]){
        fun(3);
    }
}

/*
Output:
1
2
1
3
1
2
1
*/
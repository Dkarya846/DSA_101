// Program for thread using interface Runnable 
class Test implements Runnable{
    public void run(){
        System.out.println("Inside the Test");
    }
}

public class Program2 {
    public static void main(String args[]){
        Thread t1 = new Thread(new Test());
        t1.start();
        System.out.println("Inside the main thread");
    }
}

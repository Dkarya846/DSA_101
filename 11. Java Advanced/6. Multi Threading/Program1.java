// Program for MultiThreading using Thread Class                                                                                                                            

class Test extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++)
            System.out.println("Inside the Test Thread");

    }
}

public class Program1{
    public static void main(String args[]) throws InterruptedException{
        Test t1 = new Test();
        t1.start();
        for(int i = 0; i < 5; i++){
            System.out.println("Inside main Thread");
            Thread.sleep(1);
        }
    }
}
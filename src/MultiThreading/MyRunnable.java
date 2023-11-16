package MultiThreading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println("Child Thread");   // executed by child thread.
        }
    }
}
class ThreadDemo{
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);  // r is target runnable
        t.start();
        for(int i = 0; i < 5; i++){
            System.out.println("Main Thread");  // executed by main thread
        }
    }
}
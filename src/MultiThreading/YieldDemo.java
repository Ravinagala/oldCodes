package MultiThreading;


class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}
public class YieldDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 5; i ++){
            System.out.println("Main Thread");
        }
    }
}

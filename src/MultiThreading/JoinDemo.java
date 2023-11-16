package MultiThreading;

class MyThread1 extends Thread{
    public void run(){
        for(int i = 0; i < 10; i ++){
            System.out.println("Child Thread");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException interruptedException){
                System.out.println("Exception due to join");
            }
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        myThread1.join(10000);

        for (int i = 0; i < 10; i ++){
            System.out.println("Main Thread");
        }
    }
}

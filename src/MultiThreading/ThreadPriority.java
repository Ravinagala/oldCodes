package MultiThreading;

public class ThreadPriority extends Thread{

    public static void main(String[] args) {
        ThreadPriority th1 = new ThreadPriority();
        ThreadPriority th2 = new ThreadPriority();
        ThreadPriority th3 = new ThreadPriority();

        //th1.setPriority(11); thread-range is from 1-10. If range exceeds Illegal Argument Exception.

        System.out.println(Thread.currentThread().getPriority()); // by default main thread priority is 5.

        System.out.println(th1.getPriority());

        Thread.currentThread().setPriority(7);

        System.out.println(Thread.currentThread().getPriority());
        System.out.println(th1.getPriority());

        th1.setPriority(Thread.MAX_PRIORITY);

    }
}

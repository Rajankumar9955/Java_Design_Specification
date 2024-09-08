package MultiThreadingDemo;

public class MyMain {
    public static void main(String[] args) {
        Thread1 runnable=new Thread1();
        Thread thred1=new Thread(runnable);

        Thread thread2=new Thread2();

        thred1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(thred1.getState());
        System.out.println(thread2.getState());
        thred1.start();
        thread2.start();
        System.out.println(thred1.getState());
        System.out.println(thread2.getState());
        System.out.println();
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getState());

        while (thred1.isAlive() || thread2.isAlive())
        {
            System.out.println("thread1.getState() = "+thred1.getState());
            System.out.println("thread2.getState() = "+thread2.getState());
        }
    }
}

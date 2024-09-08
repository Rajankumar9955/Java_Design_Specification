package multithreading;

public class MyMain extends Thread {
    @Override
    public void run()
    {
        for(int i=0; i<10; ++i)
        {
            System.out.println(getState());
        }
    }
    public static void main(String[] args) {
        Thread thread=new MyThread();
        MyRunnable myRunnable=new MyRunnable();
        Thread myrunnable=new Thread(myRunnable);

        System.out.println("thread.getState()"+thread.getState());
        System.out.println("thread.getstate()"+myrunnable.getState());
        thread.start();
        myrunnable.start();

        thread.setPriority(MIN_PRIORITY);
        myrunnable.setPriority(MAX_PRIORITY);

    }
}

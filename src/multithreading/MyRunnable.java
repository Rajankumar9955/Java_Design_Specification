package multithreading;

public class MyRunnable implements Runnable{
    @Override
    public void run()
    {
        for(int i=0; i<10; ++i)
        {
            System.out.println("MyRunnable");
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}

package MultiThreadingDemo;

public class Thread2 extends Thread{
    public void run()
    {
        for(int i=50; i>=0; i--)
        {
            System.out.println("Extends Threads");
            System.out.println(i);
        }
        try {
            Thread.sleep(500);

        }catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}

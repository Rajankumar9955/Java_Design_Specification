package multithreading;

public class MyThread extends Thread {
 public void run()
 {
     for(int i=0;i<50; ++i)
     {
         System.out.println("MyThread");
         if(i%2==0)
         {
             System.out.println(i);
         }
     }
 }
}

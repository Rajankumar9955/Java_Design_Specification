package JavaReadWrite;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        String pathname="resources/sample.txt";
        File file=new File(pathname);
        FileReader fileReader=null;
        try {
            fileReader=new FileReader(file);
            int data=0;
            while (data!=-1)
            {
                data=fileReader.read();
                char charater=(char)data;
                Thread.sleep(5000);
                System.out.println(charater);
            }

        }catch (IOException e)
        {
            System.out.println("IO Exception");
        }catch (InterruptedException e)
        {
            System.out.println("Intrupted Exception");
        }catch ()

    }
}

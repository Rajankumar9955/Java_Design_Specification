package RandomGenerator;

import java.util.Random;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int uprbound=1000;
        for(int i=0; i<10;++i)
        {
            System.out.println(random.nextInt(uprbound));
        }
    }
}

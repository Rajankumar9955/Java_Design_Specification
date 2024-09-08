package logicalprogram.checkprime;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        long number=sc.nextLong();
        System.out.println("CheckPrime: " + CheckPrime.isPrime(number));
    }

}

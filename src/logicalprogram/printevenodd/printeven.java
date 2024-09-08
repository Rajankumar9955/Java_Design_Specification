package logicalprogram.printevenodd;

import java.util.Scanner;
//Write a program to accept a 10-digit number from a user as a string and print All the even digits of that number
public class printeven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String Number");
        String number=sc.nextLine();
        for(int i=0; i<number.length(); ++i)
        {
            char digitChar=number.charAt(i);
            int num=Integer.parseInt(digitChar+"");
            if(num%2==0)
            {
                System.out.println(num);
            }
        }
    }




}

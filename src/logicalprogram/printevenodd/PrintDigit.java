package logicalprogram.printevenodd;

import java.util.Scanner;

public class PrintDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String Number:");
        String number=sc.nextLine();
        for(int i=0; i<number.length(); ++i)

        {
            if(number.charAt(i)>='0'&& number.charAt(i)<=9)
            {
                System.out.println(number.charAt(i));
            }
        }
    }
}

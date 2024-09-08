package logicalprogram.printevenodd;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String Number:");
       String data=sc.next();
       int[] arr=new int[data.length()];
       for(int i=0; i<data.length(); ++i)
       {
           char charater=data.charAt(i);
           int res=Integer.parseInt(charater+"");
           arr[i]=res;
       }
       for(int i=0; i<arr.length;++i)
       {
          for(int j=i+1; j<arr.length; ++i)
          {
              if(arr[i]==arr[j])
              {
                  System.out.println(arr[i]);
              }
          }
       }

    }
}

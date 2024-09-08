package logicalprogram.Array;

import java.util.Scanner;

public class isSameArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int size=sc.nextInt();
        int[] arr1=new int[size];
        for(int i=0; i<arr1.length; ++i)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of second array");
        int size1=sc.nextInt();
        int[] arr2=new int[size1];
        for(int i=0; i<arr2.length; ++i)
        {
            arr2[i]=sc.nextInt();
        }
        boolean flag=true;
        if(arr1.length==arr2.length){
            for(int i=0; i<arr1.length; ++i)
            {
                if(arr1[i]!=arr2[i])
                {
                   flag=false;
                }
            }
            if (flag)
            {
                System.out.println("Arrays are same!");
            }
            else {
                System.out.println("Arrays are Different!");
            }
        }
        else {
            System.out.println("Arrays size of different:");
        }

    }

}

package logicalprogram.Array;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr1={2,6,5,8,6,4,9};
        int[] arr2={2,5,3,8};
        int[] arr3=new int[arr1.length+arr2.length];
       for(int i=0; i<arr2.length;++i)
       {
           arr3[i]+=arr1[i];
       }
        for(int i=0; i<arr1.length; ++i){
            arr3[arr2.length+i]+=arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }

}

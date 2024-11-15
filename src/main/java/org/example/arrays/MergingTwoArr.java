package org.example.arrays;

import java.lang.reflect.Array;

public class MergingTwoArr {
    public static void main(String[] args) {
        String [] arr = {"sd","fds","sdf"};
        String [] arry = {"sd","fds","sdf","adf"};
        String [] sum = new  String[ arr.length+arry.length];
       for (int i = 0; i < arr.length; i++) {
           sum[i]= arr[i];

        }
        for (int i = 0; i < arry.length; i++) {
            sum[arr.length+i]= arry[i];

        }
        for (String val:sum){
            System.out.println(val);
        }

     //  System.out.println(Array.toString(arr));
    }
   // System.out.println(Array.toString(arr));
}

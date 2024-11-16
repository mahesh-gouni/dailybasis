package org.example.arrays;

import java.util.Arrays;

public class Swaping {
    public static void main(String[] args) {
        boolean [] arr = {true,false,true,false,false,true,true,false};
        boolean[] swaped = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            swaped[arr.length-i-1]=arr[i];
           // System.out.println(swaped);
        }
        System.out.println(Arrays.toString(swaped));
    }


}

package org.example.arrays;

public class  HightestNumber {
    public static void main(String[] args) {
        int [] arr = {1,7,6,8};
        int hig =arr[0];
        int index =0;
        for (int i = 0; i <arr.length ; i++) {
            if (hig<arr[i]){
                hig=arr[i];
                index=i;

            }

        }
        System.out.println(hig);
        System.out.println(index);
    }
}

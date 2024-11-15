package org.example.arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int sum =0;
        double avg =0;
        int [] arr = {9,6,6,5,6};
        for (int i= 0;i<arr.length;i++){
            sum +=arr[i];

        }
        System.out.println(sum);
        System.out.println(arr.length);
        avg= (double) sum/arr.length;
        System.out.println(avg);
    }
}

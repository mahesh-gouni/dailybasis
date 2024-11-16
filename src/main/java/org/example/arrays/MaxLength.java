package org.example.arrays;

public class MaxLength {
    public static void main(String[] args) {
String [] ar = {"mahesh","ruthik","manoj","gopi","bheresh"};
String max = ar[0];
int index =0;
        for (int i = 0; i < ar.length; i++) {
            if (max.length()<ar[i].length()){
                max =ar[i];
                index=i;

            }

        }
        System.out.println(max);
        System.out.println(index);
    }
}

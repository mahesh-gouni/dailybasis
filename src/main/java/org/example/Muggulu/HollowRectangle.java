package org.example.Muggulu;

public class HollowRectangle {
    public static void main(String[] args) {
        int i = 5;
        int j=4;
        for (int k = 1; k <=i; k++) {
            for (int l = 1; l <=j; l++) {

                if (k==1 ||l==1||k==i|| l==j)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }
}

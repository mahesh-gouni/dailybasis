package org.example.Muggulu;

public class ReverseRight {
    public static void main(String[] args) {
        int m=5;

        for (int i = m; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}

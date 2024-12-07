package org.example.javabasicprograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check is prime or not");
        int n = sc.nextInt();

if (n<2) System.out.println("it is not prime number"+n);
else {
    boolean isPrime=true;
    for (int i = 2; i <=Math.sqrt(n) ; i++) {
        if (n%i==0){
            System.out.println("it is not prime");
            break;
        }
        else System.out.println("it is prime ");

    }

}

    }
}

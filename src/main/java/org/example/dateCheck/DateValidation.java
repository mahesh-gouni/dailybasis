package org.example.dateCheck;

public class DateValidation {

    public static void main(String[] args) {
        int n=8;

        System.out.println((n==0)?"zero"+n:((n%2==0)?"even"+n:"odd"+n));
    }

}

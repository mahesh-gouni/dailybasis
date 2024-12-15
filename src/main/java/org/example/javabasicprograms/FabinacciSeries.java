package org.example.javabasicprograms;

public class FabinacciSeries {

    public static int adding(int k){
        int i=0;
        int j=1;
        int result=0;


        for (int m=1;m<=k;m++){
            result=j+i;
            i = j;
            j = result;
            System.out.println(result);

        }
        return result; }

    public static void main(String[] args) {

       int fac=
               adding(5);
        System.out.println("final output"+fac);

    }
}

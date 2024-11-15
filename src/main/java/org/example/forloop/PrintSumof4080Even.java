package org.example.forloop;

public class PrintSumof4080Even {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 40; i<=80;i++){
            if (i%2==0){
                sum+=i;
            }

        }
        System.out.println(sum);
    }
}

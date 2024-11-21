package org.example.strings;

public class RepeatedWords {
    public static void main(String[] args) {
        int count =0;
        String s = "hello iam mahesh , iam from khammam";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='m'){
                count+=1;
            }
            else {

            }

        }
        System.out.println(count);

    }
}

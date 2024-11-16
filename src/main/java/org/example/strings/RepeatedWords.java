package org.example.strings;

public class RepeatedWords {
    public static void main(String[] args) {
        int count =0;
        String s = "hello iam mahesh , iam from khammam";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!='m'){

            }
            else {
                count+=1;
            }

        }
        System.out.println(count);

    }
}

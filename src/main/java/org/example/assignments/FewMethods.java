package org.example.assignments;

public class FewMethods {
    public static void main(String[] args) {
        String s1 = "mahesh";

        //find the length of the string
        System.out.println(s1.length());

        //no of words in a string

        String s2 = "intellij isea community editioin";
          String[]words =s2.split(" ");
        System.out.println(words.length);


        //no of targeted elements
        String s3 ="ayipoyindhi annav  ga rah am chesthunnav ";
        int count =0;


        for (int i = 0; i <s3.length(); i++) {
            if ('n'==s3.charAt(i))count+=1;
            else {}


        }
        System.out.println(" no of word target "+count);
    }
}

package org.example.dsastarting;

public class Palindrom {
    public static void main(String[]args){
//        System.out.println("");
//        String s1 = "mahi";
//
//        String s2 ="mahi";
//        String s3 = new String("mahi");
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);

        String s1 ="mahesh";
      //  char[] chars = new char[s1.length()];
        String rv ="";
        int n   = s1.length();


        for (int i = n-1; i >=0; i--) {

          // String se ="";
           char ch = s1.charAt(i);
           rv+=ch;

              ///   rv.charAt(s1.length()-i-1)=i


        }
        System.out.println(rv);


    }
}

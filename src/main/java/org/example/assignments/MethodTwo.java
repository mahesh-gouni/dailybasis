package org.example.assignments;

public class MethodTwo {
    public static void main(String[] args) {

        String s1= "do hardwork to achive your goals";

//       char[] arr =s1.toCharArray();
//       char[] res = new char[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            res[arr.length-i-1]=arr[i];
//
//        }
      //  System.out.println(res);

        String revusings="";
        for (int j =s1.length()-1;j>=0; j--) {
            char word= s1.charAt(j );
            revusings+=word;

        }
        System.out.println(revusings);

    }
}

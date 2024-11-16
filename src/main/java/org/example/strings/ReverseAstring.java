package org.example.strings;

public class ReverseAstring {
    public static void main(String[] args) {
        String r = "mahesh";
      char[] chars =r.toCharArray();
      char[] chars1 = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            chars1[chars1.length-i-1]= chars[i];

        }
//        for ( char v:chars){
//            chars1[chars.length-1]=v;
//        }
        System.out.println(chars1);
    }

}

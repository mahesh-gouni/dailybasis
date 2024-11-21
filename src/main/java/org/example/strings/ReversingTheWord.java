package org.example.strings;

public class ReversingTheWord {
    public static void main(String[] args) {
        String see = "lets try my self mahesh";
        String rev= "";
       String[] words = see.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i]+" ";

            String rwoed = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                rwoed+=word.charAt(j);


            }
            rev +=rwoed;
        }
        System.out.println(rev);

    }
}

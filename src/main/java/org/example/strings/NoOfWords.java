package org.example.strings;

public class NoOfWords {
    public static void main(String[] args) {
        int count = 0;
        String w = "is it nessecary to learn the dsa ?";
      //  System.out.println(Arrays.toString(w.split(" ")));
         String[] words = w.split(" ");


        System.out.println(words.length);

    }
}

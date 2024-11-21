package org.example.strings;

public class WordIsReverse {
    public static void main(String[] args) {
        String m = "My name is mahesh";
       String r = "";
      String[] arr =  m.split(" ");
      for (int j = 0;j<arr.length;j++ ) { 

          String word = arr[j]+" ";
        String arv="";
          for (int i = word.length() - 1; i >= 0; i--) {
              arv += word.charAt(i);


          }
          r+=arv;
      }
        System.out.println(r);

    }

}

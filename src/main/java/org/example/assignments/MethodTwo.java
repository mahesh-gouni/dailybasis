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

        //reverse single word not in the

      String svm ="jetbranins intellij idea community editiion";

      String rvm="";
       String[] words = svm.split(" ");
        for (int m = 0; m <words.length; m++) {
            String word= words[m]+" ";
            String rvs ="";
            for (int p= word.length()-1; p >=0 ; p--) {
                rvs+=word.charAt(p);

            }
            rvm+=rvs;

        }
        System.out.println(rvm);


        //odd position upper case and even reverse
        // i/p put is question
        String odd="odd position upper case and even reverse";
        String op ="";
         String[] allwords  =  odd.split(" ");
        for (int i = 0; i <allwords.length; i++) {
            String word =allwords[i]+" ";
            if (i%2==0){


                op+=word.toUpperCase();

            }else {

                String rvs="";
              //  String word =allwords[i];
                for (int j = word.length()-1; j >=0 ; j--) {
                    rvs+=word.charAt(j);



                }
               // System.out.print(" ");
              op  +=rvs;
           //     System.out.print(" ");

            }
        //    System.out.print(" ");

        }
        System.out.println(op);

        String identifingtheword ="-3274;oh&(7*Y87qewqt";
        System.out.println("verifing the each char");

        int uppercase=0;
        int lowercasse=0;
        int number=0;
        int specialchar=0;
        char[]each = identifingtheword.toCharArray();
        for ( char c:each) {
            if (Character.isUpperCase(c)) uppercase++;
            else if (Character.isLowerCase(c)) lowercasse++;
            else if (Character.isDigit(c)) number++;
            else specialchar++;

        }
        System.out.println(uppercase);
        System.out.println(lowercasse);
        System.out.println(number);
        System.out.println(specialchar);



    }
}

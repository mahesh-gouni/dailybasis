package org.example.handson.stringsandmethod;

import java.util.Arrays;

public class StringPool {
    public static void main(String[] args) {
        String s="mahesh";
        String st = new String("mahesh");
        String str ="mahesh";
       // s="m";
        System.out.println(s==st);
        System.out.println(s==str);
        String sy="hello";
        System.out.println(sy.length());
        //methods

        //equals method
        System.out.println(s.equals(st));
        String casec="MjaljaNNNLuo";

        //case conversion
        System.out.println(  casec.toLowerCase());
        System.out.println(casec.toUpperCase());

        System.out.println(casec.startsWith("M"));
        System.out.println(casec.endsWith("Luo"));
        System.out.println(casec.contains("ja"));

        // contains method
        String cont=" I am a noob ?";
        System.out.println(cont.contains("noob?"));

        //length
        System.out.println(casec.length());
        //trim
        String tim ="  lka  sjf   ";
        System.out.println(tim);
        System.out.println(tim.trim());
        //to converting to the character array
        String s4= "hello mahesh practice dont study and leave";
        System.out.println("checking the char array");
        System.out.println(s4.toCharArray());

        //sub string check
String sub= s4.substring(0,5);
        System.out.println("sub string");
        System.out.println(sub);
        //index of method
        System.out.println(s4.indexOf("m"));
        //if we provide a char which does not existing on the string it will return the "-1"

        System.out.println(s4.lastIndexOf("e"));
        System.out.println(s4.length());

        //split method
        String sgm = "my name is mahesh";

       String[] spt = sgm.split(" ");
        System.out.println(spt);
        System.out.println(Arrays.toString(spt));

        //carrot method
        System.out.println( sgm.charAt(9));

        //replace
        String replacesmethod ="checking the replace method";
        System.out.println(replacesmethod.replace("the","for"));
        System.out.println(replacesmethod);


        //converting into the interger
        String num ="96669";
        System.out.println(Integer.valueOf(num));



    }

}

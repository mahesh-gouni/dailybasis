package org.example.bufferAndBuilder;

public class MutabilityTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("jajamahesh");
        StringBuffer sb2= new StringBuffer("jaja");
        System.out.println();  sb.reverse();
        System.out.println(sb);
        System.out.println(sb==sb2);
        System.out.println( sb.hashCode());

        String a = "mahesh";
        String b = "mahesh";
        System.out.println(a==b);
        //String d="gouni";
        a+="gouni";
        System.out.println(a==b);
        String e ="maheshgouni";
        System.out.println(a==e);
        System.out.println(a.equals(e));
        System.out.println(  a.hashCode());
    }
}

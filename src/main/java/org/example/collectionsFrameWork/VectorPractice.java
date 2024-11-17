package org.example.collectionsFrameWork;

import java.util.*;

public class VectorPractice {
   // VectorPractice vectorPractice// new
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(0,7);
        v.add(0,8);
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println(v.get(2));
        System.out.println(v);



        Vector v2 = new Vector();
        v2.add(0,"guj");
        v2.add(1,"guj");
        v2.add(7);
        System.out.println(v2);


        v.removeAll(v);
        System.out.println(v);
    }
}

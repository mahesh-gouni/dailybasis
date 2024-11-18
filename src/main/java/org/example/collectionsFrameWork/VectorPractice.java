package org.example.collectionsFrameWork;

import java.util.*;

public class VectorPractice {
   // VectorPractice vectorPractice// new
    public static void main(String[] args) {
        Object [] obj ={1,5,7,};
        Vector v5 = new Vector(Arrays.asList(obj));
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(0,7);
        v.add(0,"mahi");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println(v.get(2));
        System.out.println(v);

        System.out.println("convertd to list"+v5);

        Vector v2 = new Vector();
        System.out.println("v size  "+v2.size());
        System.out.println(v2.capacity());
        v2.add(0,"guj");
        v2.add(1,"guj");
        v2.add(7);
        System.out.println(v2);
        int sum =0;
  //sum =(Integer) v2.get(0)+ (Integer) v2.get(8);
        //Class cast exception


      //  v.removeAll(v);
        System.out.println(v);
        ArrayList<Integer> ary = new ArrayList<>();
        System.out.println("al si"+ary.size());
        ary.add(1);
        //System.out.println(ary.cap);
        System.out.println("al si"+ary.size());

        Vector v7 = new Vector();
        v7.add("ahfnjk");
        v7.add("ahfnjk");
        v7.add("ahfnjk");
        v7.add("ahfnjk");
        System.out.println(v7+"v7");
        Object[] toarry= v7.toArray();
        System.out.println( "converting the list to arry"+Arrays.toString(toarry));

    }
}

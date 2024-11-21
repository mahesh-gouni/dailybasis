package org.example.collectionsFrameWork.set;

import java.util.HashSet;

public class HashSetPractice {

    public static void main(String[] args) {
        HashSet<Integer> hm = new HashSet<>();
        hm.add(3);
        hm.add(4);
    //    hm.add(null);
        hm.add(6);
        hm.add(6);
        System.out.println(hm);

    }


}

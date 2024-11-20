package org.example.advancedLoops;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorForward {
    public static void main(String[] args) {

        LinkedList<Integer> ashri = new LinkedList<>(Arrays.asList(7,8,3,3,9));
       ListIterator<Integer> krish = ashri.listIterator();
      //  krish.add(4);
       while (krish.hasNext()){
           System.out.println(  krish.next());
       //    krish.add(4);

       }
   //     krish.toArray
       // krish.hasNext();
        krish.add(4);
//        while (krish.hasNext()){
//            System.out.println(  krish.next());
//
//        }
//       krish.hasNext();
//        System.out.println(krish.next());


        System.out.println(ashri);


        while (krish.hasPrevious()){
            System.out.println(krish.previous());
        }
        krish.remove();
        System.out.println(ashri);

    }

}

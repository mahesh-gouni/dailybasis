package org.example.advancedLoops;

import java.util.*;

public class IteratorInterfacesss {
    public static void main(String[] args) {

        Vector<Integer> hash =new Vector<>(Arrays.asList(1,3,5,7));
      //  Iterator<Integer> i =
//                hash.iterator().next();
////        while (i.hasNext()){
////
////            i.next();
////          //  i.remove();
////        }
////        i.remove();
////
//        System.out.println(hash);
////        //illegalstateexception
        Iterator<Integer> iterator = hash.iterator();

        // Iterate through all elements
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        // Force a NoSuchElementException
        System.out.println("Trying to access an element beyond the end...");
       // System.out.println("Next Element: " + iterator.next()); // This will throw NoSuchElementException
    }
    }


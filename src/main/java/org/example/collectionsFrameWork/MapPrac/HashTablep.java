package org.example.collectionsFrameWork.MapPrac;

import java.util.Collections;
import java.util.Hashtable;
import java.*;
import java.util.*;

public class HashTablep {
    public static void main(String[] args) {
        //creating the map
        //map used for the storing the key and value pairs
        Map<Integer,String> emp= new Hashtable<>();

        //adding elements using (PUT)
        emp.put(501,"dyaneswar");
        emp.put(502,"bheresh");
        emp.put(503,"prashanth");
        emp.put(504,"shiva");
 emp.remove(501,"dyaneswar");
        System.out.println(emp);

        //geting the all key
      Set<Integer> allKeys= emp.keySet();
      for (int key:allKeys){
          System.out.println(key);
      }
        System.out.println();
        System.out.println();

        //getting values all usign value
       Collection<String> c = emp.values();
       for (String val:c){
           System.out.println(val);

       }

       //geting by get metthod
        System.out.println(emp.get(501));

       //enteris set
      Set<Map.Entry<Integer,String>> entries =  emp.entrySet();
      for (Map.Entry entry:entries){
        int key = (int) entry.getKey();
              String vl= (String) entry.getValue();
          System.out.println(key);
          System.out.println(vl);
        }

        System.out.println("using stresmd");
        emp.entrySet().stream()
                .forEach(entry ->
                        System.out.println(entry.getKey() + ": " + entry.getValue())
                );



    }
}

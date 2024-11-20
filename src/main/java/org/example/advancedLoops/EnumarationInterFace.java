package org.example.advancedLoops;

import java.util.Enumeration;
import java.util.Stack;
import java.util.*;

public class EnumarationInterFace {
    public static void main(String[] args) {
        Stack<String> resumes = new Stack<>();
        resumes.push("ma");
        resumes.push("he");
        resumes.push("sh");
        Enumeration<String> enumeration = resumes.elements();
       // resumes.search()

       // List<Integer> list = List.of(1, 2, 3);
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }
}

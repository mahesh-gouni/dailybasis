package org.example.gettingresult;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class Testing {

    public static void main(String[] args) {


   List<Student> res = new Vector<>();


        Student mahi = new Student(35,37,74,59,40,"Pass");
        Student gorre = new Student(23,97,84,29,10,"fail");
        Student mk = new Student(37,2,74,59,40,"fail");
        Student mawa = new Student(58,37,74,59,40,"Pass");
        Student psyco = new Student(77,97,84,99,40,"Pass");



        res.add(mahi);
        res.add(gorre);
        res.add(mk);
        res.add(mawa);
        res.add(psyco);
      //  Iterator it = res.iterator();
//        List<Student> passing = res.stream().
//                filter(validation ->  validation.getResult().equals("Pass")
//
//                ).collect(Collectors.toList());
//        List<Result> re = passing.stream().map(
//                mappingResult ->new Result(mappingResult.getResult())
//        ).collect(Collectors.toList());
        List<Result> re = res.stream()
                .filter(validation -> validation.getResult().equalsIgnoreCase("Pass"))       // Filter students with "Pass"
                .map(mappingResult -> new Result(mappingResult.getResult()))       // Map filtered students to Result objects
                .collect(Collectors.toList());                                     // Collect to a list of Result

        System.out.println(re);


        //System.out.println(re);

    }

}

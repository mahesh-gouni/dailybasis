package org.example.collectionsFrameWork;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<Double> s = new Stack<>();
      //  Stack<Double> s = new Stack<>(20); it is not possibble
        // we cant create default values for the stack
        s.push(1.23);
        s.push(5.33);
        s.push(7.33);
        s.push(9.33);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.search(1.23));

    }
}

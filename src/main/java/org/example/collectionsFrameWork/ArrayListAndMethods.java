package org.example.collectionsFrameWork;

import java.util.ArrayList;

public class ArrayListAndMethods {
ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("maeh");
        arrayList1.add("maeh");
        arrayList1.add("maeh");
        arrayList1.add("maeh");
        arrayList1.add("maeh");
        arrayList1.add(4,"lallu bhai");
        System.out.println(arrayList1);
arrayList1.get(1);
arrayList1.set(5,"july");
arrayList1.contains("lallu");
arrayList1.remove(3);
        System.out.println(arrayList1.contains("maeh"));
        System.out.println(arrayList1.remove(3));
        System.out.println(arrayList1);
    }

}

package org.example.javaConcepts;

public class ThisKeyword {
    int a =10;
    public int getA() {
        return a;
    }

    public void setA(int a,ThisKeyword t) {
       t.a = a;
    }



    public static void main(String[] args) {
        ThisKeyword th = new ThisKeyword();
        th.setA(30,th);
        System.out.println(th.getA());

    }


}

package org.example.offlne;

public class GoodMorning implements Maps{


    @Override
    public void greet() {
        System.out.println("hey good morning");
    }

    @Override
    public String sendoff(String a, String b) {
        return "";
    }

    public static void main(String[] args) {


        GoodMorning m = new GoodMorning();



    }

}

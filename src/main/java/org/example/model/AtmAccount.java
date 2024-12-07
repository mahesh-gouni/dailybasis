package org.example.model;

public class AtmAccount {
    private String name;
    private int age;
    private double amount;



    public void setName(String name){
        this.name   =name;
    }
    public String getName(){
        return name;
    }

     public void setAge(int age){
        this.age=age;
     }
     public int getAge(){
        return age;
     }

     public void setAmount(double amount){
        this.amount =amount;
     }
     public double getAmount(){
        return amount;
     }
}

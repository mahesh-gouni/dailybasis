package org.example.gettingresult;

public class Student {
   private int english;
   private int telugu;

    public Student(int english, int telugu, int hindi, int science, int social,  String result) {
        this.english = english;
        this.telugu = telugu;
        this.hindi = hindi;
        this.science = science;
        this.social = social;
        this.result = result;
    }

    private int hindi;
    private int science;
    private int social;
    private  String result;


    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getTelugu() {
        return telugu;
    }

    public void setTelugu(int telugu) {
        this.telugu = telugu;
    }

    public int getHindi() {
        return hindi;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getSocial() {
        return social;
    }

    public void setSocial(int social) {
        this.social = social;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


}

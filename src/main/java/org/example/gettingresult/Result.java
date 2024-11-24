package org.example.gettingresult;

public class Result {

    public String getRes() {
        return res;
    }

    @Override
    public String toString() {
        return "Result{" +
                "res='" + res + '\'' +
                '}';
    }

    public void setRes(String res) {
        this.res = res;
    }

    public Result(String res) {
        this.res = res;
    }

    String res ;
}

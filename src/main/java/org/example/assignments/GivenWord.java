package org.example.assignments;

public class GivenWord {
    public static void main(String[] args) {
        int java =0;

        String dh =" java sdhiawpoiehf avja java sofjpoaf java oiafjo java";
        String j="java";
        String[] words =dh.split(" ");

        for (int i = 0; i < dh.length(); i++) {
            String word=words[i];
            if (j.equalsIgnoreCase(word)) java ++;

        }
        System.out.println(java);


    }
}

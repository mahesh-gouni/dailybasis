package org.example.streams;

import java.util.*;

public class Student507 {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    private String id;
    private String name;
    private List<Subject> subjects = new ArrayList<>();

    public void add(Subject subjects){
        this.subjects.add(subjects);
    }
    public List<Subject> get(Subject subject) {
      //  this.subjects.get(subject);
        return subjects;
    }


}

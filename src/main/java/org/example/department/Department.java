package org.example.department;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String nameOfdep;

    @Override
    public String toString() {
        return "Department{" +
                "nameOfdep='" + nameOfdep + '\'' +
                ", depcode=" + depcode +
                ", employeeList=" + employeeList +
                '}';
    }

    public int getDepcode() {
        return depcode;
    }

    public void setDepcode(int depcode) {
        this.depcode = depcode;
    }

    private int depcode;


    List<Employee> employeeList = new ArrayList<>();
    public void add(Employee employee){
        this.employeeList.add(employee);
    }

    public Employee get(Employee employee){


        return employee;
    }

    public String getNameOfdep() {
        return nameOfdep;
    }

    public void setNameOfdep(String nameOfdep) {
        this.nameOfdep = nameOfdep;
    }
}

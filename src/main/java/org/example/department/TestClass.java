package org.example.department;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.max;

public class TestClass {
    public static void main(String[] args) {



        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();
        Employee e6 = new Employee();
        Employee e7 = new Employee();
        Employee e8 = new Employee();
        List<Employee> listofemp = new Vector<>();
        listofemp.add(e1);
        listofemp.add(e2);
        listofemp.add(e3);
        listofemp.add(e4);
        listofemp.add(e5);
        listofemp.add(e6);
        listofemp.add(e7);
        listofemp.add(e8);


        e1.setId("8p507");
        e1.setName("mahesh");
        e1.setSalary(948389.0);

        e2.setId("8p502");
        e2.setName("bheresh");
        e2.setSalary(65456.52);

        e3.setId("8p503");
        e3.setName("manoj");
        e3.setSalary(54946.0);

        e4.setId("8p509");
        e4.setName("ruthik");
        e4.setSalary(656549.0);

        e5.setId("8p514");
        e5.setName("anil");
        e5.setSalary(986746.0);

        e6.setId("8p517");
        e6.setName("pavan");
        e6.setSalary(90846.0);

        e7.setId("8p575");
        e7.setName("churi");
        e7.setSalary(70846.0);

        e8.setId("8p515");
        e8.setName("gopig");
        e8.setSalary(540846.0);


        Department dev = new Department();
        Department dep = new Department();
        Department  main = new Department();
        Department oncall = new Department();

dev.setDepcode(1);
dev.setNameOfdep("development");
dev.employeeList.add(e1);
        System.out.println(dev);

        dev.setDepcode(1);
        dev.setNameOfdep("development");
        dev.employeeList.add(e2);
        System.out.println(dev);


        dep.setDepcode(2);
        dep.setNameOfdep("deployment");
        dep.employeeList.add(e3);

        dep.setDepcode(2);
        dep.setNameOfdep("deployment");
        dep.employeeList.add(e4);


        main.setDepcode(3);
        main.setNameOfdep("maintain");
        main.employeeList.add(e5);

        main.setDepcode(3);
        main.setNameOfdep("maintain");
        main.employeeList.add(e6);

        oncall.setDepcode(4);
        oncall.setNameOfdep("calling");
        oncall.employeeList.add(e6);

        oncall.setDepcode(1);
        oncall.setNameOfdep("calling");
        oncall.employeeList.add(e8);

        List<Department> departments = new Vector();
        departments.add(dev);
        departments.add(dep);
        departments.add(main);
        departments.add(oncall);
        System.out.println("mahi");
        System.out.println(departments);

      Optional< Employee> higheestsalary=
                departments.stream()
                .flatMap(
                department -> listofemp.stream())

       .max(Comparator.comparingDouble(Employee::getSalary));

        System.out.println(Arrays.asList(higheestsalary).iterator().hasNext() );
        System.out.println(Arrays.asList(higheestsalary).iterator().next());
        System.out.println(Arrays.asList(higheestsalary).stream().collect(Collectors.toList()));



        higheestsalary.ifPresent(employee ->
                System.out.println("Highest Salary Employee: " + employee.getName() + " with salary " + employee.getSalary())
        );


    }
}

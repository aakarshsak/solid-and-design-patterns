package com.upgrad.designpatterns.structural.composite.companydirectory;

public class CompositeDemo {
    public static void main(String[] args) {

        Employee emp1 = new Analyst("Alfred", "Sr. Analyst");
        Employee emp2 = new Analyst("Shane", "Business Analyst");

        Employee manager1 = new Manager("Matt","Product Manager");
        manager1.add(emp1);
        manager1.add(emp2);

        Employee emp3 = new Analyst("John", "Sr Manager");

        Manager director = new Manager("Harry", "Director");

        director.add(emp3);
        director.add(manager1);
        director.getEmployeeRecord();
    }
}

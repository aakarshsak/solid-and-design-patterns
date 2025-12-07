package com.upgrad.designpatterns.structural.composite.companydirectory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee{
    private String name;
    private String title;
    protected List<Employee> employees = new ArrayList<>();

    public Manager(String name,String title){
        this.name = name;
        this.title = title;
    }

    public void add(Employee employee) {
        employees.add(employee);
    }


    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void getEmployeeRecord() {
        System.out.println("**************************");
        System.out.println("Name = " + getName());
        System.out.println("Title = " + getTitle());
        System.out.println("**************************");

        Iterator employeeIterator = employees.iterator();
        while(employeeIterator.hasNext()){
            Employee employee = (Employee) employeeIterator.next();
            employee.getEmployeeRecord();
        }
    }


}

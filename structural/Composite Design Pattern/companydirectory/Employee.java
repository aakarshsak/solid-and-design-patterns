package com.upgrad.designpatterns.structural.composite.companydirectory;

public interface Employee {
    void getEmployeeRecord();

    void add(Employee employee);
    void remove(Employee employee);
    String getName();
}

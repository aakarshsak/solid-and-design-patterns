package com.upgrad.designpatterns.structural.composite.companydirectory;

public class Analyst implements Employee{
    private String name;
    private String title;

    public Analyst(String name, String title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }

    @Override
    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void getEmployeeRecord() {
        System.out.println("**************************");
        System.out.println("Name = " + getName());
        System.out.println("Title = " + getTitle());
        System.out.println("**************************");
    }

}

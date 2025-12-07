package com.upgrad.designpatterns.structural.decorator.good;

public class GenericHero implements Hero{

    @Override
    public String name() {
        return "Generic Hero";
    }

    @Override
    public Double power() {
        return 1000.00;
    }
}

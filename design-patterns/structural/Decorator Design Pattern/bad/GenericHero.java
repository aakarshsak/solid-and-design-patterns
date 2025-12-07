package com.upgrad.designpatterns.structural.decorator.bad;

public class GenericHero extends Hero{
    @Override
    public String getName() {
        return "Generic Hero";
    }

    @Override
    public Double power() {
        return 1000.00;
    }
}

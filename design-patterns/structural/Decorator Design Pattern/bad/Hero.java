package com.upgrad.designpatterns.structural.decorator.bad;

import java.util.ArrayList;
import java.util.List;

public abstract class Hero {
    List<SuperPower> superPowers = new ArrayList<>();


    public abstract String getName();
    public abstract Double power();

    public void add(SuperPower superPower){
        superPowers.add(superPower);
    }

    public Double totalPower(){
        Double total = power();
        for(SuperPower superPower: superPowers){
            total += superPower.power();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(getName());
        for(SuperPower superPower: superPowers){
            stringBuilder.append(", ");
            stringBuilder.append(superPower.name());
            stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }
}

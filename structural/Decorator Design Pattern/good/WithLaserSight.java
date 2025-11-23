package com.upgrad.designpatterns.structural.decorator.good;

public class WithLaserSight implements Hero {
    private Hero hero;

    public WithLaserSight(Hero hero) {
        this.hero = hero;
    }

    @Override
    public String name() {
        return hero.name() + ", Eyes Shoot Laser";
    }

    @Override
    public Double power() {
        return hero.power() + 150.00;
    }
}

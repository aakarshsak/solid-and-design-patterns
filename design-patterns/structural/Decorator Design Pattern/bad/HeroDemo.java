package com.upgrad.designpatterns.structural.decorator.bad;

public class HeroDemo {
    public static void main(String[] args) {
        Hero hero = new GenericHero();
        hero.add(new Fly());
        System.out.println(hero);
    }
}

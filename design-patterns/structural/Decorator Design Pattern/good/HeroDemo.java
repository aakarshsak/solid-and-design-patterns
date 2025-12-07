package com.upgrad.designpatterns.structural.decorator.good;

public class HeroDemo {
    public static void main(String[] args) {
        // Create generic Hero 1
        Hero hero1 = new GenericHero();

        // Give Generic Hero1 Flying Power
        hero1 = new CanFly(hero1);

        // Now we have a Generic Hero 1 With Flying Power, give him/her Laser Sight
        hero1 = new WithLaserSight(hero1);

        System.out.println(hero1);
        System.out.println(hero1.name());
        System.out.println(hero1.power());
        System.out.println("----------------------------------");


        // Create generic Hero 2 with Flying and Super Strength Power.
        Hero hero2 = new GenericHero();
        hero2 = new CanFly(hero2);
        hero2 = new WithSuperStrength(hero2);

        System.out.println(hero2);
        System.out.println(hero2.name());
        System.out.println(hero2.power());
        System.out.println("----------------------------------");

        // Create generic Hero 3 with Super Strength Power and Laser Sight.
        Hero hero3 = new GenericHero();
        hero3 = new WithSuperStrength(hero3);
        hero3 = new WithLaserSight(hero3);

        System.out.println(hero3);
        System.out.println(hero3.name());
        System.out.println(hero3.power());
        System.out.println("----------------------------------");
    }
}

package com.upgrad.designpatterns.behavioral.mediator.bad;

public class Parking {
    private boolean available;
    private String name;
    private Car car;

    public Parking(String name) {
        this.name = name;
        this.available = true;
    }

    public void park(Car car){
        this.car = car;
        System.out.println(car.getName() + " is being parked in " + name);
        this.car.park(this);
        this.available = false;
    }

    public void makeAvailable(){
        this.available = false;
        this.car = null;
        System.out.println("Parking " + name + " is Available.");
    }

    public boolean isAvailable(){
        return available;
    }

    public String getName() {
        return name;
    }
}

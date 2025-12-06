package com.upgrad.designpatterns.behavioral.mediator.bad;

public class Car {
    private String name;
    private Parking parking;

    public Car(String name) {
        this.name = name;
    }

    public void park(Parking parking){
        this.parking = parking;
        System.out.println(name + " is Parked in " + parking.getName());
    }

    public String getName() {
        return name;
    }

    public boolean isParked(){
        return parking != null;
    }

    public void unPark(){
        System.out.println("Unparking " + name + " from parking " + parking.getName());
        this.parking.makeAvailable();
        this.parking = null;

    }
}

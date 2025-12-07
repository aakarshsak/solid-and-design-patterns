package com.upgrad.designpatterns.behavioral.mediator.bad;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<Parking> parkingsList = new ArrayList<>();

    public ParkingLot() {

        this.parkingsList.add(new Parking("Spot A30"));
        this.parkingsList.add(new Parking("Spot B20"));
//        this.parkingsList.add(new Parking("Spot C10"));
    }

    public void register(Parking parking){
        parkingsList.add(parking);
    }

    public void park(Car car){
        for(Parking parking: parkingsList){
            if(parking.isAvailable()){
                parking.park(car);
                return;
            }
        }

        System.out.println("The Parking is full. Could not park the " + car.getName());
    }
}

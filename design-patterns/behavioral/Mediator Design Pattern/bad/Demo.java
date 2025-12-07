package com.upgrad.designpatterns.behavioral.mediator.bad;

public class Demo {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();

        Car hyundaiI10 = new Car("Hyundai i10");
        parkingLot.park(hyundaiI10);

        Car nano = new Car("Tata nano");
        parkingLot.park(nano);
//
        Car honda_city = new Car("Honda City");
        parkingLot.park(honda_city);


    }


}

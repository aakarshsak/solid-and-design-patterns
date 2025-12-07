package com.upgrad.designpatterns.behavioral.observer.good;

public class ChannelBeta implements Observer {
    public void update(String msg){
        System.out.println("CHANNEL BETA: " + msg);
    }
}

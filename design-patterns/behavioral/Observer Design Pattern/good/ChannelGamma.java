package com.upgrad.designpatterns.behavioral.observer.good;

public class ChannelGamma implements Observer {
    public void update(String msg){
        System.out.println("CHANNEL GAMMA: " + msg);
    }
}

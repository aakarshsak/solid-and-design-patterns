package com.upgrad.designpatterns.behavioral.observer.good;


//OBSERVER
public class ChannelAlpha implements Observer {
    public void update(String msg){
        System.out.println("CHANNEL ALPHA: " + msg);
    }
}

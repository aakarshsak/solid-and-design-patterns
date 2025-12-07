package com.upgrad.designpatterns.principles.dip.good;


public class TalkingBot implements Bot {
    public void talk() {
        System.out.println("Hi! I'm a Talking robot.");
    }

    @Override
    public void perform() {
        this.talk();
    }
}

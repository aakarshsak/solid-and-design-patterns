package com.upgrad.designpatterns.principles.dip.bad;


public class BotDemo {
    public static void main(String[] args) {
        WalkingBot walkingBot = new WalkingBot();
        TalkingBot talkingBot = new TalkingBot();

        walkingBot.walk();
        talkingBot.talk();
    }

}

package com.upgrad.designpatterns.principles.dip.good;


import java.util.ArrayList;
import java.util.List;

public class BotDemo {
    public static void main(String[] args) {
        List<Bot> bots = new ArrayList<Bot>();
        bots.add(new WalkingBot());
        bots.add(new TalkingBot());

        bots.forEach(bot -> bot.perform());
    }

}

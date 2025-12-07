package com.upgrad.designpatterns.behavioral.chain.bad;

public class InfoLogger extends Logger{
    public InfoLogger(Levels level) {
        super(level);
    }

    @Override
    public void log(String msg) {
        System.out.println("INFO LOGGER: " + msg);
    }

}

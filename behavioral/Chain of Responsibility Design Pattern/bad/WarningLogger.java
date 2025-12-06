package com.upgrad.designpatterns.behavioral.chain.bad;

public class WarningLogger extends Logger{
    public WarningLogger(Levels level) {
        super(level);
    }

    @Override
    public void log(String msg) {
        System.out.println("WARNING LOGGER: " + msg);
    }

}

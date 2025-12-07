package com.upgrad.designpatterns.behavioral.chain.bad;

public class ErrorLogger extends Logger{
    public ErrorLogger(Levels level) {
        super(level);
    }

    @Override
    public void log(String msg) {
        System.out.println("ERROR LOGGER: " + msg);
    }

}

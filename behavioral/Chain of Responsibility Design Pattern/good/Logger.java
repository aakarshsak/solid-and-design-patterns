package com.upgrad.designpatterns.behavioral.chain.good;

public abstract class Logger {
    protected int level;
    //    INFO should be logged ONLY in INFO Logger
    public static int INFO = 1;
    //    WARNING should be logged ONLY in INFO, WARNING Logger
    public static int WARNING = 2;
    //    ERROR should be logged in all INFO, WARNING, ERROR Logger
    public static int ERROR = 3;

    protected Logger nextLogger;

    protected abstract void handleRequest(String msg);

    public void setNextLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void log(int logLevel, String msg){
        if(this.level <= logLevel){
            handleRequest(msg);
        }
        if(nextLogger !=null){
            nextLogger.log(logLevel, msg);
        }
    }
}

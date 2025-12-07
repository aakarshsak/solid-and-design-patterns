package com.upgrad.designpatterns.behavioral.chain.bad;

public class LoggingService {
    InfoLogger infoLogger;
    ErrorLogger errorLogger;
    WarningLogger warningLogger;

    public LoggingService() {
        this.infoLogger = new InfoLogger(Levels.INFO);
        this.warningLogger = new WarningLogger(Levels.WARNING);
        this.errorLogger = new ErrorLogger(Levels.ERROR);

    }

    public void log(Levels level, String msg){
        if(level == Levels.ERROR){
            errorLogger.log(msg);
        }
        if(level == Levels.WARNING){
            warningLogger.log(msg);
        }
        if(level == Levels.INFO){
            infoLogger.log(msg);
        }
    }
}

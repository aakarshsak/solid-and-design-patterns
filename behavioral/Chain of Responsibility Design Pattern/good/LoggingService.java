package com.upgrad.designpatterns.behavioral.chain.good;

public class LoggingService {
    private Logger logger;

    public LoggingService() {

        Logger infoLogger = new InfoLogger(Logger.INFO);
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger warningLogger = new WarningLogger(Logger.WARNING);

        errorLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(infoLogger);

        this.logger = errorLogger;
    }

    public void log(int level, String msg){
        logger.log(level, msg);
    }
}

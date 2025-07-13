package DesignPatterns.ChainOfResponsibilityPattern;

public abstract class Log {
    Log log;
    Log(Log log) {
        this.log = log;
    }

    public void next(LogType logType) {
        if(log != null) {
            System.out.println("Moving to next class");
            log.next(logType);
        }
        else {
            System.out.println("no defined logger");
        }
    }
}

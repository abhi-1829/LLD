package DesignPatterns.ChainOfResponsibilityPattern;

public class Debug extends Log{
    Debug(Log log) {
        super(log);
    }

    @Override
    public void next(LogType logType) {
        if(logType == LogType.DEBUG) {
            System.out.println("Debug Logger");
        }
        else {
            super.next(logType);
        }
    }
}
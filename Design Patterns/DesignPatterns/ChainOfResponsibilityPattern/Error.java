package DesignPatterns.ChainOfResponsibilityPattern;

public class Error extends Log{
    Error(Log log) {
        super(log);
    }
    public void output(LogType logType) {
        if(logType == LogType.ERROR) {
            System.out.println("Error Logger");
        }
        else {
            super.next(logType);
        }
    }
}
package DesignPatterns.ChainOfResponsibilityPattern;

public class Info extends Log{
    Info(Log log) {
        super(log);
    }

    @Override
    public void next(LogType logType) {
        if(logType == LogType.INFO) {
            System.out.println("Info Logger");
        }
        else {
            super.next(logType);
        }
    }
}

package DesignPatterns.ChainOfResponsibilityPattern;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Log logger = new Info(new Debug(new Error(null)));
        logger.next(LogType.DEBUG);
        logger.next(LogType.INFO);
        logger.next(LogType.ERROR);
    }
}

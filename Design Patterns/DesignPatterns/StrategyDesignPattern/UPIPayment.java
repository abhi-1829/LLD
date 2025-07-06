package DesignPatterns.StrategyDesignPattern;

public class UPIPayment implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Payed " + amount + " via UPI");
    }
}

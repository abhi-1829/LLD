package DesignPatterns.StrategyDesignPattern;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payed " + amount + " via Credit Card");
    }
}

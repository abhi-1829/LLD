package DesignPatterns.StrategyDesignPattern;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {

    }
    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkOut(int amount) {
        if(paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set.");
        }
        else {
            paymentStrategy.pay(amount);
        }
    }
}

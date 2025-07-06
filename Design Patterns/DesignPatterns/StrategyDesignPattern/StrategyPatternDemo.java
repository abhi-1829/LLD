package DesignPatterns.StrategyDesignPattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment("112343567576"));
        cart.checkOut(1000);
        cart.setPaymentStrategy(new UPIPayment());
        cart.checkOut(100);
    }
}

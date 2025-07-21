package DesignPatterns.StateDesignPattern;

public interface State {
     void insertCoin(VendingMachine vendingMachine, int coins);
     void selectProduct(VendingMachine vendingMachine, int productId);
     void dispense(VendingMachine vendingMachine, int productId);
}

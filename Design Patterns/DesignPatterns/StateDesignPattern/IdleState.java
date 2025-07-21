package DesignPatterns.StateDesignPattern;

public class IdleState implements State{

    @Override
    public void insertCoin(VendingMachine vendingMachine, int coins) {
        System.out.println("Coin inserted");
        vendingMachine.setCoins(coins);
        vendingMachine.setState(new HasCoinState());
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productId) {
        System.out.println("Please insert coins first.");
    }

    @Override
    public void dispense(VendingMachine vendingMachine, int productId) {
        System.out.println("Insert coins and select product first.");
    }

}

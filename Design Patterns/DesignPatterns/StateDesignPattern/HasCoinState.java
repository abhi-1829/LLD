package DesignPatterns.StateDesignPattern;

public class HasCoinState implements State{
    @Override
    public void insertCoin(VendingMachine vendingMachine, int coins) {
        System.out.println("Please select product.");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productId) {
        if(vendingMachine.getCoins() == 0) {
            System.out.println("No Coin inserted");
            vendingMachine.setState(new IdleState());
            return;
        }
        if(vendingMachine.getProducts().containsKey(productId) &&
                vendingMachine.getProducts().get(productId) > 0) {
                vendingMachine.setState(new DispenseState());
                vendingMachine.getState().dispense(vendingMachine, productId);
        }
        else {
            System.out.println("Please choose correct product");
        }
    }

    @Override
    public void dispense(VendingMachine vendingMachine, int productId) {
        System.out.println("Please select product.");
    }

}

package DesignPatterns.StateDesignPattern;

import java.util.Optional;

public class DispenseState implements State{
    @Override
    public void insertCoin(VendingMachine vendingMachine, int coins) {
        System.out.println("Can't Insert Coins");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productId) {
        System.out.println("No Coins");
    }

    @Override
    public void dispense(VendingMachine vendingMachine, int productId) {
        Optional<Product> product = vendingMachine.getProductList().stream().filter(a -> a.getId() == productId).findFirst();
        if(product.isEmpty()) {
            System.out.println("Opps Something went wrong");
            vendingMachine.getProducts().remove(productId);
            refund(vendingMachine);
            vendingMachine.setState(new IdleState());
            return;
        }
        Product product1 = product.get();
        if(product1.getPrice() > vendingMachine.getCoins()) {
            System.out.println("Insuffient coins");
            refund(vendingMachine);
            vendingMachine.setState(new IdleState());

        }
        System.out.println("Product Selected, now Dispensing " + product1.getName());
        vendingMachine.setTotalCollection(vendingMachine.getCoins() + vendingMachine.getTotalCollection());
        if(vendingMachine.getCoins() > product1.getPrice()) {
            vendingMachine.setCoins(vendingMachine.getCoins() - product1.getPrice());
            refund(vendingMachine);
        }
        vendingMachine.setCoins(0);
        vendingMachine.setState(new IdleState());
    }

    public void refund(VendingMachine vendingMachine) {
        if(vendingMachine.getCoins() > 0)
            System.out.println(vendingMachine.getCoins() + " Refunded");

    }
}

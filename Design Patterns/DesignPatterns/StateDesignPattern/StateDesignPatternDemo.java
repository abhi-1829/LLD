package DesignPatterns.StateDesignPattern;

public class StateDesignPatternDemo {
    public static void main(String[] args) {
        Product p1 = new Product(1 , "Coke", 20);
        Product p2 = new Product(2 , "Coke", 20);
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getProductList().add(p1);
        vendingMachine.getProductList().add(p2);
        vendingMachine.getProducts().put(p1.getId(), 2);
        vendingMachine.getProducts().put(p2.getId(), 2);
        vendingMachine.getState().insertCoin(vendingMachine , 30);
        vendingMachine.getState().selectProduct(vendingMachine, 1);

    }
}

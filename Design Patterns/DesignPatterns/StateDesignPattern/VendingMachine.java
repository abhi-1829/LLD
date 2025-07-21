package DesignPatterns.StateDesignPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachine {
    private State state;
    private List<Product> productList;

    public Map<Integer, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Integer> products) {
        this.products = products;
    }

    private Map<Integer, Integer> products;

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getTotalCollection() {
        return totalCollection;
    }

    public void setTotalCollection(int totalCollection) {
        this.totalCollection = totalCollection;
    }

    private int coins;
    private int totalCollection;
    VendingMachine() {
        state = new IdleState();
        productList = new ArrayList<>();
        products = new HashMap<>();
        coins = 0;
        totalCollection = 0;

    }
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}

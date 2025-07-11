package DesignPatterns.DecoratorPattern;


public class DecoratorPatternDemo {
    public static void main(String[] args) {
        BasePizza mushroomPizza = new ExtraMushroom(new FarmhousePizza(10));
        System.out.println("mushroomPizza cost: " + mushroomPizza.getCost());
        BasePizza cheesePizza = new ExtraCheese(new FarmhousePizza(20));
        System.out.println("cheesePizza cost: " + cheesePizza.getCost());
        BasePizza cheeseMushroomPizza = new ExtraMushroom(new ExtraCheese(new FarmhousePizza(20)));
        System.out.println("cheeseMushroomPizza cost: " + cheeseMushroomPizza.getCost());
    }

}

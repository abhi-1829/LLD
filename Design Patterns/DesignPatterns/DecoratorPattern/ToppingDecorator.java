package DesignPatterns.DecoratorPattern;

public abstract class ToppingDecorator extends BasePizza {
    BasePizza basePizza;
    ToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int getCost() {
        return basePizza.getCost() + 10;
    }
}

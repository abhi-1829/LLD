package DesignPatterns.DecoratorPattern;

public class ExtraCheese extends ToppingDecorator{
    ExtraCheese(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getCost() {
        return super.basePizza.getCost() + 20;
    }
}

package DesignPatterns.DecoratorPattern;

public class ExtraMushroom extends ToppingDecorator{
    ExtraMushroom(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getCost() {
        return super.basePizza.getCost() + 50;
    }
}

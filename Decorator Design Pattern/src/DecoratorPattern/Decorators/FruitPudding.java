package DecoratorPattern.Decorators;

import DecoratorPattern.IMilkTea;
import DecoratorPattern.MilkTeaDecorator;

public class FruitPudding extends MilkTeaDecorator {
    private double price = 3;
    public FruitPudding(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double Cost() {
        return price + super.Cost();
    }
}

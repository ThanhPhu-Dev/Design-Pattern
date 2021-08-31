package DecoratorPattern.Decorators;

import DecoratorPattern.IMilkTea;
import DecoratorPattern.MilkTeaDecorator;

public class EggPudding extends MilkTeaDecorator {
    private double price = 3;
    public EggPudding(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double Cost() {
        return price + super.Cost();
    }
}

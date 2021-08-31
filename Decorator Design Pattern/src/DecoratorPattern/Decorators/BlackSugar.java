package DecoratorPattern.Decorators;

import DecoratorPattern.IMilkTea;
import DecoratorPattern.MilkTeaDecorator;

public class BlackSugar extends MilkTeaDecorator {
    private double price = 2;
    public BlackSugar(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double Cost() {
        return price + super.Cost();
    }
}

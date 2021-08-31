package DecoratorPattern.Decorators;

import DecoratorPattern.IMilkTea;
import DecoratorPattern.MilkTeaDecorator;

public class WhiteBubble extends MilkTeaDecorator {
    private double price = 1.5;

    public WhiteBubble(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double Cost() {
        return price + super.Cost();
    }
}

package DecoratorPattern.Decorators;

import DecoratorPattern.IMilkTea;
import DecoratorPattern.MilkTeaDecorator;

public class Bubble extends MilkTeaDecorator {

    private String name = "Bubble";
    private double price = 1;

    public Bubble(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double Cost() {
        return price + super.Cost();
    }

}

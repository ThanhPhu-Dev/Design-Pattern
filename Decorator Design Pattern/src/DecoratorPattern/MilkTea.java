package DecoratorPattern;

public class MilkTea implements IMilkTea{
    private double price = 5;


    @Override
    public double Cost() {
        return price;
    }


}

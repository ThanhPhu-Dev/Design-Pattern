package StrategyPattern;

public class NoDiscountStrategy implements IPromoteStrategy{
    /**
     * @param price
     * @return Giá gốc
     */
    @Override
    public double DoDiscount(double price) {
        return price;
    }
}

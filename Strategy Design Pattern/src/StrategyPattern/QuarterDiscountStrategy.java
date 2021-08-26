package StrategyPattern;

public class QuarterDiscountStrategy implements IPromoteStrategy{
    /**
     * @param price
     * @return giá sau khi giảm 1/4 giá gốc
     */
    @Override
    public double DoDiscount(double price) {
        return price * 0.75;
    }
}

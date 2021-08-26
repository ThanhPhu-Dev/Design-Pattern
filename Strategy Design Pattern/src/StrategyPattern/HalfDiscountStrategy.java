package StrategyPattern;

public class HalfDiscountStrategy implements IPromoteStrategy{
    /**
     * @param price
     * @return giá sau khi giảm 1/2 giá gốc
     */
    @Override
    public double DoDiscount(double price) {
        return price;
    }
}

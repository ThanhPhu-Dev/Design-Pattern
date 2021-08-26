package StrategyPattern;

public class Ticket {
    private double price;
    private IPromoteStrategy promoteStrategy;
    private String name;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public IPromoteStrategy getPromoteStrategy() {
        return promoteStrategy;
    }

    public void setPromoteStrategy(IPromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ticket(){

    }

    public Ticket(IPromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public double getPromotedPrice(){
        return promoteStrategy.DoDiscount(price);
    }
}

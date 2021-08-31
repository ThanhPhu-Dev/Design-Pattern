package DecoratorPattern;

import DecoratorPattern.Decorators.*;

public class main {

    /*
    * MilkTea: 5$
    * Bubble: 1$
    * BlackSugar: 2$
    * EggPudding: 3$
    * FruitPudding: 3$
    * WhiteBubble: 1.5$
    *
    * firstMilkTea = EggPuddingAndFruitPuddingAndBlackSugarAndBubbleMilkTea: 3 + 3 + 2 + 1+ 5 = 14$
    * secondMilkTea = EggPuddingAndBlackSugarAndWhiteBubbleMilkTea: 3 + 2 + 1.5 + 5 = 11.5$
    * */
    public static void main(String[] args) {
        //kết quả hứng có thể là abstract class
        MilkTeaDecorator firstMilkTea = new EggPudding(new FruitPudding(new BlackSugar(new Bubble(new MilkTea()))));
        System.out.println("EggPuddingAndFruitPuddingAndBlackSugarAndBubbleMilkTea: " + firstMilkTea.Cost());

        //cũng có thể là interface
        IMilkTea secondMilkTea = new EggPudding(new BlackSugar(new WhiteBubble(new MilkTea())));
        System.out.println("EggPuddingAndBlackSugarAndWhiteBubbleMilkTea: "+secondMilkTea.Cost());
    }
}

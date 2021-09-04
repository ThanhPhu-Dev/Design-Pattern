package FactoryPattern.AbstractFactory;

import FactoryPattern.Animal.Chicken;
import FactoryPattern.Animal.Duck;
import FactoryPattern.Animal.IAnimal;

import java.util.Random;

public class TwoLegAnimalFactory implements IAnimalFactory{
    @Override
    public IAnimal createAnimal() {
        Random random = new Random();
        int type = random.nextInt( 2);
        if (type == 0)
        {
            return new Chicken();
        }
        else
        {
            return new Duck();
        }
    }
}

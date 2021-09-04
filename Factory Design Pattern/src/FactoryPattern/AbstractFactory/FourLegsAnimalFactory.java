package FactoryPattern.AbstractFactory;

import FactoryPattern.Animal.Cat;
import FactoryPattern.Animal.Dog;
import FactoryPattern.Animal.IAnimal;

import java.util.Random;

public class FourLegsAnimalFactory implements IAnimalFactory{
    @Override
    public IAnimal createAnimal() {
        Random random = new Random();
        int type = random.nextInt( 2);
        if (type == 0)
        {
            return new Dog();
        }
        else
        {
            return new Cat();
        }
    }
}

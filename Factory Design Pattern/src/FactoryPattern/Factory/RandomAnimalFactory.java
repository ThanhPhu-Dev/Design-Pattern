package FactoryPattern.Factory;

import FactoryPattern.Animal.Cat;
import FactoryPattern.Animal.Dog;
import FactoryPattern.Animal.Duck;
import FactoryPattern.Animal.IAnimal;

import java.util.Random;

/**
 * tạo ngẫu nhiên 1 object.
 */
public class RandomAnimalFactory{
    public IAnimal createAnimal() {
        Random random = new Random();
        int index = random.nextInt(3);
        switch (index){
            case 0:
                return new Dog();
            case 1:
                return new Cat();
            case 2:
                return new Duck();
        }
        return null;
    }
}

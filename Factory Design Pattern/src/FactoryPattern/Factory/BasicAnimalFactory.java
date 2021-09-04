package FactoryPattern.Factory;

import FactoryPattern.Animal.Cat;
import FactoryPattern.Animal.Dog;
import FactoryPattern.Animal.Duck;
import FactoryPattern.Animal.IAnimal;

/**
 * Class làm nhiệm vụ tạo lần lượt theo thử tự mỗi khi gọi.
 */
public class BasicAnimalFactory{
    int index = 0;

    public IAnimal createAnimal() {
        if(index == 0){
            index++;
            return new Dog();
        }
        if(index == 1){
            index++;
            return new Cat();
        }

        if(index == 2){
            index = 0;
            return new Duck();
        }
        return null;
    }
}

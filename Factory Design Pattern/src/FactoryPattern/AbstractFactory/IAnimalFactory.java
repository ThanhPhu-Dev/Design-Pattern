package FactoryPattern.AbstractFactory;

import FactoryPattern.Animal.IAnimal;

/**
 * factory Abstract: có thể tạo interface hoặc abstract class
 */
public interface IAnimalFactory {
    public IAnimal createAnimal();
}

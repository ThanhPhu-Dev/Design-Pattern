package FactoryPattern.Animal;

/**
 * nếu dùng factory method chỉ cần impl IAnimal
 */
public class Dog extends FourLegsAnimal{
    @Override
    public String getName() {
        return "Dog";
    }
}

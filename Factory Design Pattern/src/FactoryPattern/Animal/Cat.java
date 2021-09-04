package FactoryPattern.Animal;

/**
 * nếu dùng factory method chỉ cần impl IAnimal
 */
public class Cat extends FourLegsAnimal{
    @Override
    public String getName() {
        return "Cat";
    }
}

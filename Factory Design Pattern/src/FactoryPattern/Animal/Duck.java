package FactoryPattern.Animal;

/**
 * nếu dùng factory method chỉ cần impl IAnimal
 */
public class Duck extends TwoLegsAnimal{
    @Override
    public String getName() {
        return "Duck";
    }
}

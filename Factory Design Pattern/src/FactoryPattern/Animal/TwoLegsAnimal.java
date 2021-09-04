package FactoryPattern.Animal;

public abstract class TwoLegsAnimal implements IAnimal{

    //cách method tùy ý dành cho 2 chân

    /**
     * @return cho các lớp extend làm
     */
    @Override
    public abstract String getName();
}

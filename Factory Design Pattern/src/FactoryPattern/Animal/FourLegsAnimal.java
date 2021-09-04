package FactoryPattern.Animal;

public abstract class FourLegsAnimal implements IAnimal{

    //các method tùy ý chỉ dành cho 4 chân

    /**
     * @return chuyển xuống cho các extend làm
     */
    @Override
    public abstract String getName();
}

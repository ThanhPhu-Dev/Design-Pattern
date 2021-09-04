package FactoryPattern;

import FactoryPattern.AbstractFactory.FourLegsAnimalFactory;
import FactoryPattern.AbstractFactory.IAnimalFactory;
import FactoryPattern.AbstractFactory.TwoLegAnimalFactory;
import FactoryPattern.Factory.BasicAnimalFactory;
import FactoryPattern.Factory.RandomAnimalFactory;

import java.util.Random;

public class main {

    public static void main(String[] args) {
        System.out.println("---------------------------Method Factory-------------------------------------");
        /*Factory method*/
        //method basic:  các animal tạo ra lần lượt theo thứ tự Dog - Cat - Duck
        BasicAnimalFactory factoryMethodBasic = new BasicAnimalFactory();
        System.out.println("Basic 1: " + factoryMethodBasic.createAnimal().getName());
        System.out.println("Basic 2: " + factoryMethodBasic.createAnimal().getName());
        System.out.println("Basic 3: " + factoryMethodBasic.createAnimal().getName());
        //method random: các animal tạo ra một cách ngẩu nhiên
        RandomAnimalFactory factoryMethodRandom = new RandomAnimalFactory();
        System.out.println("Random 1: "+ factoryMethodRandom.createAnimal().getName());
        System.out.println("Random 2: "+ factoryMethodRandom.createAnimal().getName());
        System.out.println("Random 3: "+ factoryMethodRandom.createAnimal().getName());



        /*abstract factory*/
        System.out.println("---------------------------Abstract Factory-------------------------------------");
        //sau khi có 1 lớp quản lý tạo ra ngẩu nhiên nhóm 4 chân hoặc 2 chân thì về sau generate các object chỉ
        // thuộc đúng kiểu đó
        IAnimalFactory factory = GenarateGroupLegs();
        System.out.println(factory.getClass().getSimpleName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());

    }

    /**
     * @return có thể tạo ra 1 class với method static là lớp super factory để làm nhiệm vụ này
     */
    private static IAnimalFactory GenarateGroupLegs() {
        Random random = new Random();
        IAnimalFactory factory = null;
        int index = random.nextInt(2);

        if(index == 0){
            factory = new FourLegsAnimalFactory();
        }else{
            factory = new TwoLegAnimalFactory();
        }
        return factory;
    }
}

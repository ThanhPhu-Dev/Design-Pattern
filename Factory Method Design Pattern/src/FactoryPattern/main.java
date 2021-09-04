package FactoryPattern;

import FactoryPattern.Animal.IAnimal;
import FactoryPattern.Factory.BasicAnimalFactory;
import FactoryPattern.Factory.IAnimalFactory;
import FactoryPattern.Factory.RandomAnimalFactory;

import java.util.Random;

public class main {

    public static void main(String[] args) {
        Random random = new Random();
        IAnimalFactory factory = null;
        int index = random.nextInt(2);

        if(index == 0){
            factory = new BasicAnimalFactory();
        }else{
            factory = new RandomAnimalFactory();
        }

        //nếu ra giống nhau nghĩa là đang tạo kiểu BasicAnimalFactory
        //nếu tạo ra không giống nhau là tạo theo kiểu RandomAnimalFactory
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());

    }
}

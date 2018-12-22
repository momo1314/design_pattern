package org.redrock.Abstract_Factory;

import org.redrock.Abstract_Factory.CarEmpty.Car;
import org.redrock.Abstract_Factory.ColorEmpty.Color;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory carFactory = FactoryProducer.getFactory("Car");
        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        Car car1 = carFactory.getCar("BMW");
        if(car1 != null) car1.run();
        Color color1 = colorFactory.getColor("Red");
        if(color1 != null) color1.fill();

        Car car2 = carFactory.getCar("Jeep");
        if(car2 != null) car2.run();
        Color color2 = colorFactory.getColor("Yellow");
        if(color2 != null) color2.fill();

        Car car3 = carFactory.getCar("Audi");
        if(car3 != null) car3.run();
        if(color1 != null) color1.fill();






    }
}

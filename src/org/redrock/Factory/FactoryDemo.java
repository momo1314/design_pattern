package org.redrock.Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car car1 = factory.getCar("BMW");
        if(car1 != null) car1.run();
        Car car2 = factory.getCar("Jeep");
        if(car2 != null) car2.run();
        Car car3 = factory.getCar("Audi");
        if(car3 != null) car3.run();
    }
}

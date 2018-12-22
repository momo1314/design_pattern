package org.redrock.Abstract_Factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Car")){
            return new CarFactory();
        }else if(choice.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }
        return null;
    }
}

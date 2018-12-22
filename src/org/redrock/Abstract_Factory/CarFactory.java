package org.redrock.Abstract_Factory;

import org.redrock.Abstract_Factory.CarEmpty.Audi;
import org.redrock.Abstract_Factory.CarEmpty.BMW;
import org.redrock.Abstract_Factory.CarEmpty.Car;
import org.redrock.Abstract_Factory.CarEmpty.Jeep;
import org.redrock.Abstract_Factory.ColorEmpty.Color;

public class CarFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Car getCar(String carType){
        if(carType == null){
            return null;
        }
        if(carType.equalsIgnoreCase("BMW")){
            return new BMW();
        }else if(carType.equalsIgnoreCase("Jeep")){
            return new Jeep();
        }else if(carType.equalsIgnoreCase("Audi")){
            return new Audi();
        }

        return null;
    }
}

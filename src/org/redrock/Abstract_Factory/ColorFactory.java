package org.redrock.Abstract_Factory;

import org.redrock.Abstract_Factory.CarEmpty.Car;
import org.redrock.Abstract_Factory.ColorEmpty.Color;
import org.redrock.Abstract_Factory.ColorEmpty.Red;
import org.redrock.Abstract_Factory.ColorEmpty.Yellow;

public class ColorFactory extends AbstractFactory{

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("YELLOW")){
            return new Yellow();
        }
        return null;
    }

    @Override
    public Car getCar(String carType) {
        return null;
    }
}

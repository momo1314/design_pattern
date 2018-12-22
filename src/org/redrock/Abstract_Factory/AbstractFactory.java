package org.redrock.Abstract_Factory;

import org.redrock.Abstract_Factory.CarEmpty.Car;
import org.redrock.Abstract_Factory.ColorEmpty.Color;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Car getCar(String carType);
}

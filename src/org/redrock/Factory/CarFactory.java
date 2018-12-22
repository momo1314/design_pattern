package org.redrock.Factory;

public class CarFactory {
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

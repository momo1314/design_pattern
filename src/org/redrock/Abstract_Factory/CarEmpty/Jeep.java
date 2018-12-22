package org.redrock.Abstract_Factory.CarEmpty;

import org.redrock.Abstract_Factory.CarEmpty.Car;

public class Jeep  implements Car {

    @Override
    public void run() {
        System.out.print("Jeep is Running!");
    }
}

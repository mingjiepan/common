package com.mjie.pattern.factory.simplefactory;

import com.mjie.pattern.factory.BenzCar;
import com.mjie.pattern.factory.BmwCar;
import com.mjie.pattern.factory.Car;
import com.mjie.pattern.factory.ToyotaCar;

/**
 * @author panmingjie
 * @date 2018/12/1 09:24
 */
public class CarStore {

    public Car orderCar(String type) {
        Car car;
        if ("Toyota".equals(type)) {
            car = new ToyotaCar();
        } else if ("Benz".equals(type)) {
            car = new BenzCar();
        } else {
            car = new BmwCar();
        }

        car.prepare();
        car.box();
        return car;
    }
}

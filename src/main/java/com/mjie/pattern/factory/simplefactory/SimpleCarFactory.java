package com.mjie.pattern.factory.simplefactory;

import com.mjie.pattern.factory.BenzCar;
import com.mjie.pattern.factory.BmwCar;
import com.mjie.pattern.factory.Car;
import com.mjie.pattern.factory.ToyotaCar;

/**
 * 简单工厂，若createCar加上static，变成静态工厂
 * @author panmingjie
 * @date 2018/12/1 09:29
 */
public class SimpleCarFactory {

    public Car createCar(String type) {
        Car car = null;
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

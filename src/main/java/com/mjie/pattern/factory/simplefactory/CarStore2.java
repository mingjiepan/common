package com.mjie.pattern.factory.simplefactory;

import com.mjie.pattern.factory.Car;

/**
 * @author panmingjie
 * @date 2018/12/1 09:29
 */
public class CarStore2 {
    private SimpleCarFactory simpleCarFactory;

    public void setSimpleCarFactory(SimpleCarFactory simpleCarFactory) {
        this.simpleCarFactory = simpleCarFactory;
    }

    public Car order(String type) {
        Car car = simpleCarFactory.createCar(type);
        car.prepare();
        car.box();
        return car;
    }
}

package com.mjie.pattern.factory.factorymethod;

import com.mjie.pattern.factory.*;

/**
 * @author panmingjie
 * @date 2018/12/1 10:18
 */
public class UsCarStore extends CarStore3 {
    @Override
    protected Car createCar(String type) {
        Car car;
        if("bmw".equals(type)) {
            car = new UsBmwCar();
        } else {
            car = new UsBenzCar();
        }
        return car;
    }
}

package com.mjie.pattern.factory.factorymethod;

import com.mjie.pattern.factory.Car;
import com.mjie.pattern.factory.ChinaBenzCar;
import com.mjie.pattern.factory.ChinaBmwCar;

/**
 * @author panmingjie
 * @date 2018/12/1 10:14
 */
public class ChinaCarStore extends CarStore3 {
    @Override
    protected Car createCar(String type) {
        Car car;
        if("bmw".equals(type)) {
            car = new ChinaBmwCar();
        } else {
            car = new ChinaBenzCar();
        }
        return car;
    }
}

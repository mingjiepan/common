package com.mjie.pattern.factory;

import com.mjie.pattern.factory.Car;

/**
 * @author panmingjie
 * @date 2018/12/1 10:16
 */
public class ChinaBenzCar extends BenzCar {
    @Override
    public void prepare() {
        System.out.println("china benz prepare");
    }

    @Override
    public void box() {
        System.out.println("china benz box");
    }
}

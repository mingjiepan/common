package com.mjie.pattern.factory;

/**
 * @author panmingjie
 * @date 2018/12/1 09:25
 */
public class BenzCar implements Car {
    @Override
    public void prepare() {
        System.out.println("benz car");
    }

    @Override
    public void box() {
        System.out.println("benz box");
    }
}

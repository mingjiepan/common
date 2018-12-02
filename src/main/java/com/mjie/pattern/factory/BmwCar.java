package com.mjie.pattern.factory;

/**
 * @author panmingjie
 * @date 2018/12/1 09:25
 */
public class BmwCar implements Car {
    @Override
    public void prepare() {
        System.out.println("bmw prepare");
    }
    @Override
    public void box() {
        System.out.println("bmw box");
    }
}

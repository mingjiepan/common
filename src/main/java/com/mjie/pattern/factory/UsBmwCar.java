package com.mjie.pattern.factory;

/**
 * @author panmingjie
 * @date 2018/12/1 10:15
 */
public class UsBmwCar extends BmwCar {
    @Override
    public void prepare() {
        System.out.println("us bmw prepare");
    }

    @Override
    public void box() {
        System.out.println("us bmw box");
    }
}

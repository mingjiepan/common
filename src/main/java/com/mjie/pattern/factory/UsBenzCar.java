package com.mjie.pattern.factory;

/**
 * @author panmingjie
 * @date 2018/12/1 10:17
 */
public class UsBenzCar extends BenzCar {
    @Override
    public void prepare() {
        System.out.println("us benz prepare");
    }

    @Override
    public void box() {
        System.out.println("us benz box");
    }
}

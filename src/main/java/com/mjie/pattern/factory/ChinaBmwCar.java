package com.mjie.pattern.factory;

/**
 * @author panmingjie
 * @date 2018/12/1 10:15
 */
public class ChinaBmwCar extends BmwCar {
    @Override
    public void prepare() {
        System.out.println("china bmw prepare");
    }

    @Override
    public void box() {
        System.out.println("china bmw box");
    }
}

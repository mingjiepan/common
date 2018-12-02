package com.mjie.pattern.factory;

/**
 * @author panmingjie
 * @date 2018/12/1 09:26
 */
public class ToyotaCar implements Car {
    @Override
    public void prepare() {
        System.out.println("Toyota prepare");
    }

    @Override
    public void box() {
        System.out.println("Toyota box");
    }
}

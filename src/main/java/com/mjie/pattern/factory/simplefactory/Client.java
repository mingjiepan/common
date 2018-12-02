package com.mjie.pattern.factory.simplefactory;

import com.mjie.pattern.factory.Car;

/**
 * @author panmingjie
 * @date 2018/12/1 10:25
 */
public class Client {
    public static void main(String[] args) {
        CarStore2 carStore2 = new CarStore2();
        SimpleCarFactory simpleCarFactory = new SimpleCarFactory();
        carStore2.setSimpleCarFactory(simpleCarFactory);

        Car bmw = carStore2.order("bmw");
        System.out.println(bmw);
    }
}

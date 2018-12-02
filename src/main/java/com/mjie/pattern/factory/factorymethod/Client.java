package com.mjie.pattern.factory.factorymethod;

import com.mjie.pattern.factory.Car;

/**
 * @author panmingjie
 * @date 2018/12/1 10:23
 */
public class Client {
    public static void main(String[] args) {
        CarStore3 carStore3 = new ChinaCarStore();
        Car bmw = carStore3.order("bmw");
        System.out.println(bmw);

        System.out.println("-----------------------");

        carStore3 = new UsCarStore();
        bmw = carStore3.order("bmw");
        System.out.println(bmw);
    }
}

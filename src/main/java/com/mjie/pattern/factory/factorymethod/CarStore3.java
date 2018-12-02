package com.mjie.pattern.factory.factorymethod;

import com.mjie.pattern.factory.Car;

/**
 * 工厂方法模式(生产一类或一种产品)
 *
 * 工厂方法模式一般包含有以下几种角色：creator、concreteCreator、product
 *
 * 抽象的creator提供了一个创建对象的方法的接口，称为“工厂方法”（也可提供默认的实现），在抽象的creator中，任何其他实现的方法，都可能使用到这个工厂方法所制造出来的
 * 产品，但只有子类真正实现这个工厂方法并创建产品。
 *
 * 区分工厂方法模式与简单工厂的含义与使用
 *
 * @author panmingjie
 * @date 2018/12/1 10:12
 */
public abstract class CarStore3 {
    public Car order(String type) {
        Car car = createCar(type);
        car.prepare();
        car.box();
        return car;
    }
    protected abstract Car createCar(String type);
}

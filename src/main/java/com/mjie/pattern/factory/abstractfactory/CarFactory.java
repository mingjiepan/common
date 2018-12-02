package com.mjie.pattern.factory.abstractfactory;

import com.mjie.pattern.factory.BenzCar;
import com.mjie.pattern.factory.BmwCar;

/**
 * 抽象工厂模式（生产一组产品）
 * 抽象工厂的每个方法实际上看起来都像是工厂方法。每个方法被声明成抽象，而子类的方法覆盖这些方法来创建某些对象。
 *
 * 抽象工厂的任务是定义一个负责创建一组产品的接口。这个接口内的每个方法都创建一个具体的产品，同时我们利用实现抽象方法的子类来提供这些产品
 * 的具体做法。所以在抽象工厂中利用工厂方法实现生产方法是自然的做法。
 * @author panmingjie
 * @date 2018/12/1 11:02
 */
public interface CarFactory {
    BmwCar bmwCar();
    BenzCar benzCar();
}

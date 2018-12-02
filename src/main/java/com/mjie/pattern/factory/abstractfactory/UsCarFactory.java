package com.mjie.pattern.factory.abstractfactory;

import com.mjie.pattern.factory.BenzCar;
import com.mjie.pattern.factory.BmwCar;
import com.mjie.pattern.factory.UsBenzCar;
import com.mjie.pattern.factory.UsBmwCar;

/**
 * @author panmingjie
 * @date 2018/12/1 11:19
 */
public class UsCarFactory implements CarFactory{
    @Override
    public BmwCar bmwCar() {
        return new UsBmwCar();
    }

    @Override
    public BenzCar benzCar() {
        return new UsBenzCar();
    }
}

package com.mjie.pattern.factory.abstractfactory;

import com.mjie.pattern.factory.BenzCar;
import com.mjie.pattern.factory.BmwCar;
import com.mjie.pattern.factory.ChinaBenzCar;
import com.mjie.pattern.factory.ChinaBmwCar;

/**
 * @author panmingjie
 * @date 2018/12/1 11:18
 */
public class ChinaCarFactory implements CarFactory {
    @Override
    public BmwCar bmwCar() {
        return new ChinaBmwCar();
    }

    @Override
    public BenzCar benzCar() {
        return new ChinaBenzCar();
    }
}

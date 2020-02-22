package com.soft1851.group1.functional.yf;

/**
 * @ClassName CarServiceImpl
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/2/23
 **/
public class CarServiceImpl implements CarService {
    @Override
    public void drive(double distance) {
        System.out.println("汽车开了"+distance+"千米");
    }
}

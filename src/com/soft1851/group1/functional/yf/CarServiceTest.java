package com.soft1851.group1.functional.yf;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/22
 */
public class CarServiceTest {

    public static void dive(CarServiceImpl carService){
        carService.drive(34.3);
    }


    public static void main(String[] args) {

        dive(new CarServiceImpl());

        System.out.println("******");

        CarService carService = distance -> {
            System.out.println(distance);

        };
        carService.drive(12.3);
    }
}

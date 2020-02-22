package com.soft1851.group1.functional.dyf;

import java.util.Random;

/**
 * @author ding
 * @ClassaName RuInterfaceTest
 * @Despription TODO
 * @Date 2020/2/23
 * @Version 1.0
 **/
public class RuInterfaceTest {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            StringBuilder stringBuilder = new StringBuilder("139");
            Random random = new Random();
            for( int i = 0; i < 8 ; i++){
                int num = random.nextInt(10);
                stringBuilder.append(num);
            }
            System.out.println("开始随机生成手机号" + stringBuilder.toString());
        };
        Thread thread = new Thread(runnable);
        thread.start();
        RuInterface gs = message -> {
            System.out.println("Hello World!");
        };
        gs.message("Hello World!");
    }
}

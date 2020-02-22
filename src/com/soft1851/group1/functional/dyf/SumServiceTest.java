package com.soft1851.group1.functional.dyf;

import com.soft1851.group1.functional.dyf.SumService;

import java.util.Random;

/**
 * @author ding
 * @ClassaName GreetingServiceTest
 * @Despription TODO
 * @Date 2020/2/22
 * @Version 1.0
 **/
public class SumServiceTest {
    public static void main(String[] args) {
        SumService greetingService = (message, name, mobile) -> {
            StringBuilder stringBuilder = new StringBuilder("139");
            Random random = new Random();
            for( int i = 0; i < 8 ; i++){
                int num = random.nextInt(10);
                stringBuilder.append(num);
            }
            System.out.println(name+"说Hello，"+"他的手机号是" + stringBuilder.toString());
        };
        greetingService.sayMessage("Hello","汤姆", "123");
    }
}

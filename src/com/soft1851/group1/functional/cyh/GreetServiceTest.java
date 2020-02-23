package com.soft1851.group1.functional.cyh;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/23
 */
public class GreetServiceTest {
    public static void main(String[] args) {
        GreetService greetService = message -> {
            System.out.println(message);
            System.out.println(message.substring(6));
        };
        greetService.greetMethod("Hello World");
    }
}

package com.soft1851.group1.functional.wzw.third;

/**
 * @Author: zw_w
 * @Date: 2020/2/22 22:04
 * @Description:
 */
@FunctionalInterface
public interface Operate {
    /**
     * 四则运算
     * @param num1
     * @param num2
     */
    void operate(int num1, int num2);

    /**
     * 加法
     * @param num1
     * @param num2
     * @return int
     */
    static int add(int num1, int num2){
        return num1+num2;
    }
}

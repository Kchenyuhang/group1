package com.soft1851.group1.functional.wzw.third;

/**
 * @Author: zw_w
 * @Date: 2020/2/22 22:21
 * @Description:
 */
public class OperateTest {
    public static void main(String[] args) {
        Operate operate = (num1,num2)->System.out.println("数字"+num1+"和"+num2+"进行加法操作，结果是："+Operate.add(num1,num2));
        operate.operate(10,5);


    }
}

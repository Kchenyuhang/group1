package com.soft1851.group1.functional.cyh;

/**
 * @Author yhChen
 * @Description 函数式接口的使用
 * @Date 2020/2/22
 */
public class Demo {
    /**
     * 定义一个方法，参数使用函数式接口MyFunctionInterface
     *
     * @param myInter myInter
     */
    public static void show(MyFunctionInterface myInter) {
        myInter.method();
    }

    public static void main(String[] args) {
        /**
         * 调用show()方法，方法的参数是一个接口
         * 所以可以传递接口的实现类对象
         */
        show(new MyFunctionInterfaceImpl());

        /**
         * 调用show()方法 ，方法的参数是一个接口
         * 所以我们可以传递接口的匿名内部类
         */
        show(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中抽象方法");
            }
        });
        //调用show()方法 ，方法的参数是一个接口，所以我们可以使用lambda表达式
        show(() -> {
            System.out.println("使用lambda表达式重写接口中的抽象方法");
        });

        //简化lambda表达式
        show(() -> System.out.println("lambda表达式简化"));
    }
}

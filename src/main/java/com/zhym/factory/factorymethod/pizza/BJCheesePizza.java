package com.zhym.factory.factorymethod.pizza;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/27 0027 0:05
 */
public class BJCheesePizza extends Pizza {
    @Override
    void prepare() {

        System.out.println("BJ Cheese 准备");
    }
}

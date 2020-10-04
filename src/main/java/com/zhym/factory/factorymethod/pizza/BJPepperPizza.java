package com.zhym.factory.factorymethod.pizza;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/27 0027 0:07
 */
public class BJPepperPizza extends Pizza {

    @Override
    void prepare() {
        System.out.println("BJ Pepper Pizza");
    }
}

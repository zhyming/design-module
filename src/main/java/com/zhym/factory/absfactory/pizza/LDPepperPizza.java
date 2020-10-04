package com.zhym.factory.absfactory.pizza;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/27 0027 0:07
 */
public class LDPepperPizza extends Pizza {

    @Override
    void prepare() {
        System.out.println("LD Pepper Pizza");
    }
}

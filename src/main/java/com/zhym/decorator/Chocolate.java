package com.zhym.decorator;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 1:37
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes("Chocolate ....");
        setPrice(3.0f);
    }
}

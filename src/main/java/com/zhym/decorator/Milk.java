package com.zhym.decorator;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 1:37
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes("Milk ....");
        setPrice(2.0f);
    }
}

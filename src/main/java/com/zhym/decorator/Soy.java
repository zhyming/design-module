package com.zhym.decorator;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 1:37
 */
public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        setDes("Soy ....");
        setPrice(1.0f);
    }
}

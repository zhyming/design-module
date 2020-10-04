package com.zhym.factory.absfactory.order;

import com.zhym.factory.absfactory.pizza.Pizza;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/27 0027 0:30
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String type) {
        return null;
    }
}

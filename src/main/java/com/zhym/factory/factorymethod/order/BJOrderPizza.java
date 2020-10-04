package com.zhym.factory.factorymethod.order;

import com.zhym.factory.simplefactory.pizza.Pizza;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/27 0027 0:13
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String type) {
        return null;
    }
}

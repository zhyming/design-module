package com.zhym.factory.factorymethod.order;

import com.zhym.factory.simplefactory.pizza.Pizza;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/27 0027 0:13
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String type) {

        //根据类型type来进行判断，来进行实际创建
        return null;
    }
}

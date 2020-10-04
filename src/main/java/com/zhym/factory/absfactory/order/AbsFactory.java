package com.zhym.factory.absfactory.order;

import com.zhym.factory.absfactory.pizza.Pizza;

/**
 * @description: 抽象工厂接口
 * @author: zhym
 * @time: 2020/9/27 0027 0:29
 */
public interface AbsFactory {

    /**让工厂子类来具体创建*/
    Pizza createPizza(String type);
}

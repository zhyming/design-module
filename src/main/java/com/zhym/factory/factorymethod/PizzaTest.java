package com.zhym.factory.factorymethod;

import com.zhym.factory.factorymethod.order.BJOrderPizza;
import com.zhym.factory.factorymethod.order.LDOrderPizza;
import com.zhym.factory.factorymethod.order.OrderPizza;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/27 0027 0:17
 */
public class PizzaTest {

    public static void main(String[] args) {

        OrderPizza order = new BJOrderPizza();
        order.orderPizza();

        OrderPizza order2 = new LDOrderPizza();
        order2.orderPizza();
    }
}

package com.zhym.factory.absfactory.order;

import com.zhym.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/27 0027 0:31
 */
public class OrderPizza {

    AbsFactory factory;

    public void setFactory (AbsFactory factory) {

        this.factory = factory;

        do{
            String orderType = getType();
            Pizza pizza = factory.createPizza(orderType);
        }while (true);
    }

    private static String getType() {

        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("输入种类：");
            String type = reader.readLine();
            return type;
        }catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

package com.zhym.factory.factorymethod.order;

import com.zhym.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/27 0027 0:09
 */
public abstract class OrderPizza {



    public void orderPizza() {
        createPizza(getType());
    }

    //定义创建方法，让工厂子类自己实现
    abstract Pizza createPizza(String type);


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

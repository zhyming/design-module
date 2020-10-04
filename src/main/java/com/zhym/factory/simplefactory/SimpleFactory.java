package com.zhym.factory.simplefactory;

import com.zhym.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description: 简单工厂类
 * @author: zhym
 * @time: 2020/9/26 0026 23:33
 */
public class SimpleFactory {

    public static void main(String[] args) {

        Pizza pizza = createPizza(getType());

        System.out.println(pizza);
    }


    public static Pizza createPizza(String type) {

        return new Pizza("greek", type);
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

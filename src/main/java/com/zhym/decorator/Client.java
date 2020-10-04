package com.zhym.decorator;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 1:40
 */
public class Client {

    public static void main(String[] args) {
        //先创建装饰对象
        Drink drink = new LongBlack();
        System.out.println("Price --->" + drink.cost());
        System.out.println("Des ---> " + drink.getDes());

        //再创建修饰器
        drink = new Milk(drink);
        System.out.println("Price --->" + drink.cost());
        System.out.println("Des ---> " + drink.getDes());

        //再创建另外一个修饰器
        drink = new Chocolate(drink);
        System.out.println("Price --->" + drink.cost());
        System.out.println("Des ---> " + drink.getDes());

        //这样可以随意继续添加
        drink = new Chocolate(drink);
        System.out.println("Price --->" + drink.cost());
        System.out.println("Des ---> " + drink.getDes());
    }
}

package com.zhym.adapter.classadapter;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/29 0029 0:02
 */
public class Client {


    public static void main(String[] args) {

        System.out.println("=====类适配模式=====");

        Phone phone = new Phone();

        phone.charging(new VoltageAdapter());

    }
}

package com.zhym.observer.improve;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/8 0008 22:14
 */
public class Client {

    public static void main(String[] args) {
        //创建一个WeatherData
        WeatherData data = new WeatherData();

        //创建观察者
        Observer observer = new CurrentConditions();

        //注册到WeatherData
        data.registerObserver(observer);

        //测试
        System.out.println("通知注册的观察者，查看信息");
        data.setData(10f, 100f, 30.4f);

    }
}

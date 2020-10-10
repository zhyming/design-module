package com.zhym.observer;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/8 0008 21:41
 */
public class CurrentConditions {

    private float temperature;

    private float pressure;

    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("------Temperature-----" + temperature);
        System.out.println("------Pressure-----" + pressure);
        System.out.println("------Humidity-----" + humidity);
    }
}

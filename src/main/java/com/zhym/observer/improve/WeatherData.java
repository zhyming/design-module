package com.zhym.observer.improve;

import com.zhym.observer.CurrentConditions;

import java.util.ArrayList;

/**
 * @description: 核心类 包含最新数据，数据更新时调用CurrentConditions 的update
 * @author: zhym
 * @time: 2020/10/8 0008 21:45
 */
public class WeatherData implements Subject{


    //温度，气压，湿度
    private float temperature;

    private float pressure;

    private float humidity;

    //观察者集合
    private ArrayList<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        notifyObserver();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    /**
     * 遍历所有观察者并通知
     */
    @Override
    public void notifyObserver() {

        for (int i = 0; i < observers.size(); i ++) {
            observers.get(i).update(getTemperature(), getPressure(), getHumidity());
        }
    }
}

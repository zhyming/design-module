package com.zhym.observer;

/**
 * @description: 核心类 包含最新数据，数据更新时调用CurrentConditions 的update
 * @author: zhym
 * @time: 2020/10/8 0008 21:45
 */
public class WeatherData {


    //温度，气压，湿度
    private float temperature;

    private float pressure;

    private float humidity;

    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
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
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }
}

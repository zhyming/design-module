package com.zhym.observer.improve;

/**
 * @description: 观察者接口
 * @author: zhym
 * @time: 2020/10/8 0008 22:05
 */
public interface Observer {

    void update(float temperature, float pressure, float humidity);
}

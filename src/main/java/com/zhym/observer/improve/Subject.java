package com.zhym.observer.improve;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/8 0008 22:03
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();

}

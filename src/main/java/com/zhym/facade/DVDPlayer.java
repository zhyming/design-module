package com.zhym.facade;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 23:43
 */
public class DVDPlayer {

    //单例，饿汉式
    private static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer() {

    }

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("dvd on");
    }

    public void off() {
        System.out.println("dvd off");
    }

    public void play() {
        System.out.println("ded is playing");
    }

    public void pause() {
        System.out.println("dvd pause");
    }
}

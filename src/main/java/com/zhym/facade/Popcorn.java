package com.zhym.facade;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 23:46
 */
public class Popcorn {

    //单例，饿汉式
    private static Popcorn instance = new Popcorn();

    private Popcorn() {

    }

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("popcorn on");
    }

    public void off() {
        System.out.println("popcorn off");
    }

    public void play() {
        System.out.println("popcorn is playing");
    }

    public void pause() {
        System.out.println("popcorn pause");
    }

    public void pop() {
        System.out.println("popcorn pop");
    }
}

package com.zhym.facade;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 23:46
 */
public class Projector {

    //单例，饿汉式
    private static Projector instance = new Projector();

    private Projector() {

    }

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("projector on");
    }

    public void off() {
        System.out.println("projector off");
    }

    public void focus() {
        System.out.println("projector is playing");
    }

    public void pause() {
        System.out.println("projector pause");
    }
}

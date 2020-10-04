package com.zhym.facade;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 23:55
 */
public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    private TheaterLight() {

    }

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight on");
    }

    public void off() {
        System.out.println("TheaterLight off");
    }

    public void up() {
        System.out.println("TheaterLight up");
    }

    public void dim() {
        System.out.println("TheaterLight dim");
    }

    public void bright() {
        System.out.println("TheaterLight bright");
    }
}

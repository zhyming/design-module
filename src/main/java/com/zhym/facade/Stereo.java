package com.zhym.facade;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 23:52
 */
public class Stereo {
    private static Stereo instance = new Stereo();

    private Stereo() {

    }

    public static Stereo getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("stereo on");
    }

    public void off() {
        System.out.println("stereo off");
    }

    public void up() {
        System.out.println("stereo up");
    }
}

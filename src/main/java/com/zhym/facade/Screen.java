package com.zhym.facade;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 23:51
 */
public class Screen {
    private static Screen instance = new Screen();

    private Screen() {

    }

    public static Screen getInstance() {
        return instance;
    }

    public void up(){
        System.out.println("screen up");
    }

    public void down(){
        System.out.println("screen down");
    }
}

package com.zhym.bridge;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 0:22
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo open");
    }

    @Override
    public void close() {
        System.out.println("Vivo close");

    }

    @Override
    public void call() {

        System.out.println("Vivo call");

    }
}

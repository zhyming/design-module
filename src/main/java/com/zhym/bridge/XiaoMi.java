package com.zhym.bridge;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 0:21
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("Xiao Mi open");
    }

    @Override
    public void close() {

        System.out.println("Xiao Mi close");
    }

    @Override
    public void call() {

        System.out.println("Xiao Mi call");
    }
}

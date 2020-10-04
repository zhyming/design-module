package com.zhym.bridge;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 0:25
 */
public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("UpRight 。。。。open");
    }

    public void close() {
        super.close();
        System.out.println("UpRight 。。。。close");
    }

    public void call() {
        super.call();
        System.out.println("UpRight 。。。。call");
    }
}

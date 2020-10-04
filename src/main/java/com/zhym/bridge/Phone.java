package com.zhym.bridge;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 0:23
 */
public abstract class Phone {

    //组合
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }
}

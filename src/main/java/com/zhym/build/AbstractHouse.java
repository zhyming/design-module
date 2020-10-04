package com.zhym.build;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/28 0028 0:33
 */
public abstract class AbstractHouse {

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public void bulid() {
        buildBasic();
        buildWalls();
        roofed();
    }
}

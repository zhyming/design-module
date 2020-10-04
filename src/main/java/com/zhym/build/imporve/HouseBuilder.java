package com.zhym.build.imporve;

/**
 * @description: 抽象建造者
 * @author: zhym
 * @time: 2020/9/28 0028 0:51
 */
public abstract class HouseBuilder {

    protected House house = new House();

    //建造流程

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //返回构造的对象

    public House buildHouse() {
        return house;
    }
}

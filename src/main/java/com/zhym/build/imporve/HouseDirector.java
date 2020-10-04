package com.zhym.build.imporve;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/28 0028 0:58
 */
public class HouseDirector {

    HouseBuilder builder = null;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }
    //由此决定执行步骤
    public House constructHouse() {
        builder.buildBasic();
        builder.buildWalls();
        builder.roofed();

        return builder.buildHouse();
    }
}

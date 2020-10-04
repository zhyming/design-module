package com.zhym.build.imporve;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/28 0028 0:56
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("High 地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("High 砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("High 封顶");
    }
}

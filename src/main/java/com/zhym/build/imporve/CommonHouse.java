package com.zhym.build.imporve;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/28 0028 0:55
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("打地基");
    }

    @Override
    public void buildWalls() {

        System.out.println("砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("封顶");
    }
}

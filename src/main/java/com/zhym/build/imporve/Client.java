package com.zhym.build.imporve;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/28 0028 1:02
 */
public class Client {

    public static void main(String[] args) {
        HouseBuilder builder = new CommonHouse();

        HouseDirector director = new HouseDirector(builder);

        House house = director.constructHouse();

    }
}

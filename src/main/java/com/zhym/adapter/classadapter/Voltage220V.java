package com.zhym.adapter.classadapter;

/**
 * @description: 被适配对象
 * @author: zhym
 * @time: 2020/9/28 0028 23:55
 */
public class Voltage220V {

    public int output220V() {

        int src = 220;

        System.out.println("电压" + src + "伏");

        return src;
    }
}

package com.zhym.adapter.classadapter;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/29 0029 0:00
 */
public class Phone {

    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("适配上了");
        }else {
            System.out.println("不适配");
        }
    }
}

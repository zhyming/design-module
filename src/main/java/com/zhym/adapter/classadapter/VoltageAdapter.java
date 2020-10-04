package com.zhym.adapter.classadapter;

/**
 * @description: 适配接口
 * @author: zhym
 * @time: 2020/9/28 0028 23:58
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    /**
     * 进行适配处理
     * @return
     */
    @Override
    public int output5V() {

        int srcV = output220V();

        int dstV = srcV / 44;
        System.out.println("已经转化为" + dstV + "伏");
        return dstV;
    }
}

package com.zhym.adapter.objectadapter;

/**
 * @description: 适配接口
 * @author: zhym
 * @time: 2020/9/28 0028 23:58
 */
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V; //关联关系--聚合

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    /**
     * 进行适配处理
     * @return
     */
    @Override
    public int output5V() {
        int dstV = 0;
        if (voltage220V != null) {
            int srcV = voltage220V.output220V();
            dstV = srcV / 44;
        }

        System.out.println("已经转化为" + dstV + "伏");
        return dstV;
    }
}

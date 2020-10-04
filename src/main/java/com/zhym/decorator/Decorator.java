package com.zhym.decorator;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 1:31
 */
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        //先拿到本身数据 + 组合价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        //被装饰者obj的信息
        return super.getDes() + " " + super.getPrice() + "&&" + obj.getDes();
    }
}

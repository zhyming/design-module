package com.zhym.decorator;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 1:24
 */
public abstract class Drink {

    public String des;

    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}

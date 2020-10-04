package com.zhym.composite;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 22:32
 */
public abstract class OrangizationComponent {

    private String name;

    private String des;

    public OrangizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(OrangizationComponent orangizationComponent) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrangizationComponent orangizationComponent) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    protected abstract void print();
}

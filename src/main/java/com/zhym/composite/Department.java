package com.zhym.composite;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 22:45
 */
public class Department extends OrangizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}

package com.zhym.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 22:43
 */
public class College extends OrangizationComponent {

    List<OrangizationComponent> components = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrangizationComponent orangizationComponent) {
        components.add(orangizationComponent);
    }

    @Override
    protected void remove(OrangizationComponent orangizationComponent) {
        components.remove(orangizationComponent);
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {

        System.out.println("====================================" + getName());
        for (OrangizationComponent component : components) {
            component.print();
        }

    }
}

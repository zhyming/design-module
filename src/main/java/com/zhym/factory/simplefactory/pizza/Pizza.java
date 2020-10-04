package com.zhym.factory.simplefactory.pizza;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/26 0026 23:34
 */
public class Pizza {
    private String name;

    private String type;

    public Pizza(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

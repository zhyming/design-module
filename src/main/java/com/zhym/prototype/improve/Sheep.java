package com.zhym.prototype.improve;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/27 0027 1:09
 */
public class Sheep implements Cloneable{

    private String name;

    private int age;

    private String color;

    public Sheep friend;

    public Sheep() {
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    /**
     * 使用默认Object中的克隆方法来完成
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone(){

        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}

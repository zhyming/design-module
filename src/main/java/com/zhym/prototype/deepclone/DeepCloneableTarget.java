package com.zhym.prototype.deepclone;

import java.io.Serializable;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/27 0027 23:41
 */
public class DeepCloneableTarget implements Serializable, Cloneable {


    private static final long serialVersionUID = -446256904938986425L;
    private String name;

    private int age;

    public DeepCloneableTarget(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

package com.zhym.iterator;

/**
 * @author zhym
 * @description
 * @crate 2020/10/6 22:30
 */
public class Department {

    private String name;

    private String des;

    public Department(String name, String des) {
        this.name = name;
        this.des = des;
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
}

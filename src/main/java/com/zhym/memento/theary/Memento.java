package com.zhym.memento.theary;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/9 0009 23:48
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }


}

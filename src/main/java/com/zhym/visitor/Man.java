package com.zhym.visitor;

/**
 * @author zhym
 * @description
 * @crate 2020/10/6 21:33
 */
public class Man extends Person {


    public void accept(Action action) {
        action.getManResult(this);
    }
}

package com.zhym.visitor;

/**
 * @author zhym
 * @description
 * @crate 2020/10/6 21:33
 */
public abstract class Person {

    //提供一个方法，让访问者可以访问

    public abstract void accept(Action action);

}

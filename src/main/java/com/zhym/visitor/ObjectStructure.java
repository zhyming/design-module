package com.zhym.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zhym
 * @description
 * @crate 2020/10/6 21:42
 */
public class ObjectStructure {

    //维护一个集合
    private List<Person> persons = new LinkedList<Person>();

    //增加到list
    public void attach(Person p) {
        persons.add(p);
    }

    //移除
    public void detach(Person p) {
        persons.remove(p);
    }

    //处理
    public void display(Action action) {
        for (Person p: persons) {
            p.accept(action);
        }
    }
}

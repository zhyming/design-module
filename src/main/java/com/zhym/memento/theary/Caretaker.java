package com.zhym.memento.theary;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/9 0009 23:53
 */
public class Caretaker {

    //备忘录对象集合
    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    //获取指定备忘录对象
    public Memento get(int index) {
        return mementos.get(index);
    }
}

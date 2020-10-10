package com.zhym.memento.game;

import java.util.List;
import java.util.Map;

/**
 * @description: 守护者对象,保存对象状态
 * @author: zhym
 * @time: 2020/10/10 0010 0:07
 */
public class Caretaker {

    //如果只保存一次状态
    private Memento memento;

    //对GameRole 保存多次状态
    //private List<Memento> mementos;

    //对多个游戏角色保存多个状态
    //private Map<String, List<Memento>> roleMementoMap;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

package com.zhym.memento.theary;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/9 0009 23:46
 */
public class Originator {

    private String state; //状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 保存状态
     * @return
     */
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    //通过备忘录恢复状态
    public void getStateFromMementto(Memento memento) {
        state = memento.getState();
    }
}

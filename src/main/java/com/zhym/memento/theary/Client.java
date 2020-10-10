package com.zhym.memento.theary;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/9 0009 23:55
 */
public class Client {

    public static void main(String[] args) {

        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();

        originator.setState("状态1 攻击力100");

        //保存当前状态到备忘录
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态2 攻击力80");

        caretaker.add(originator.saveStateMemento());

        originator.setState("状态3 攻击力50");

        caretaker.add(originator.saveStateMemento());

        //获取状态1
        System.out.println("当前状态--->" + originator.getState());
        Memento memento = caretaker.get(1);
        originator.getStateFromMementto(memento);

        System.out.println("恢复后的状态--->" + originator.getState());
    }

}

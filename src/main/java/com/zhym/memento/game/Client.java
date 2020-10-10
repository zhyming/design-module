package com.zhym.memento.game;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/10 0010 0:14
 */
public class Client {

    public static void main(String[] args) {

        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("初始状态");
        gameRole.display();

        //保存状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("目前状态");
        gameRole.setDef(30);
        gameRole.setVit(30);
        gameRole.display();

        System.out.println("状态恢复");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        gameRole.display();
    }
}

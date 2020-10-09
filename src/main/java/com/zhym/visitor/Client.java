package com.zhym.visitor;

import java.io.ObjectInputStream;

/**
 * @author zhym
 * @description
 * @crate 2020/10/6 21:50
 */
public class Client {

    public static void main(String[] args) {

        ObjectStructure obj = new ObjectStructure();

        //加人
        obj.attach(new Man());
        obj.attach(new Woman());

        //加处理结果
        Action action = new Success();

        obj.display(action);

        System.out.println("-------------------");

        //
        Action action2 = new Fail();
        obj.display(action2);
    }
}

package com.zhym.singleton;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/26 0026 1:11
 */
public class SingletonTest03 {

    public static void main(String[] args) {
        Singleton03 instance1 = Singleton03.getInstance();

        Singleton03 instance2 = Singleton03.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1 hashcode ==》" + instance1.hashCode());
        System.out.println("instance2 hashcode ==》" + instance2.hashCode());
    }

}

class Singleton03 {

    private static Singleton03 instance;

    private Singleton03() {

    }

    //提供一个静态公有方法，调用此方法时采取创建instance
    //懒汉式 用到的时候才去创建--线程不安全
    public static Singleton03 getInstance() {

        if (instance == null) {
            instance = new Singleton03();
        }

        return instance;
    }

}

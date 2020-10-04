package com.zhym.singleton;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/26 0026 1:19
 */
public class SingletonTest04 {

    public static void main(String[] args) {

        Singleton04 instance1 = Singleton04.getInstance();

        Singleton04 instance2 = Singleton04.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1 hashcode ==》" + instance1.hashCode());
        System.out.println("instance2 hashcode ==》" + instance2.hashCode());
    }
}

class Singleton04 {

    private static Singleton04 instance;

    private Singleton04() {

    }

    //懒汉式 -- 加入线程同步 -- 加了同步效率低
    public static synchronized Singleton04 getInstance() {

        if (instance == null) {
            instance = new Singleton04();
        }
        return instance;
    }
}

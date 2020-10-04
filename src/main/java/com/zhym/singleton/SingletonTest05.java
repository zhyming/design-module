package com.zhym.singleton;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/26 0026 1:24
 */
public class SingletonTest05 {

    public static void main(String[] args) {
        Singleton05 instance1 = Singleton05.getInstance();

        Singleton05 instance2 = Singleton05.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1 hashcode ==》" + instance1.hashCode());
        System.out.println("instance2 hashcode ==》" + instance2.hashCode());
    }
}

class Singleton05 {
    private static volatile Singleton05 instance;

    private Singleton05() {

    }

    /**
     * 懒汉式
     * 双重检查
     * */

    public static Singleton05 getInstance() {
        if (instance == null) {
            synchronized (Singleton05.class) {
                if (instance == null) {
                    instance = new Singleton05();
                }
            }
        }

        return instance;
    }

}

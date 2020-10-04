package com.zhym.singleton;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/26 0026 1:35
 */
public class SingletonTest06 {

    public static void main(String[] args) {

        Singleton06 instance1 = Singleton06.getInstance();

        Singleton06 instance2 = Singleton06.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1 hashcode ==》" + instance1.hashCode());
        System.out.println("instance2 hashcode ==》" + instance2.hashCode());
    }
}

class Singleton06 {

    /**
     * 利用内部类在调用的时候才会被加载的机制，
     * 利用类加载是线程安全的
     * 使用静态内部类来创建单例
     * */

    private Singleton06() {

    }

    private static class StaticSingleton{
        private static final Singleton06 INSTANCE = new Singleton06();
    }

    public static synchronized Singleton06 getInstance() {
        return StaticSingleton.INSTANCE;
    }

}
package com.zhym.singleton;

public class SingletonTest02 {

    public static void main(String[] args) {

        Singleton02 instance1 = Singleton02.getInstance();

        Singleton02 instance2 = Singleton02.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1 hashcode ==》" + instance1.hashCode());
        System.out.println("instance2 hashcode ==》" + instance2.hashCode());
    }
}

class Singleton02 {

    /**
     * 在静态代码块中创建对象，也是在类加载时创建，与饿汉式一样
     * 问题，
     *
     */
    //1.私有化构造器
    private Singleton02() {

    }

    //2.在本类内部创建对象实例
    private static Singleton02 instance;

    static {
        instance = new Singleton02();
    }

    //3.提供一个公有的返回实例的静态方法
    public static Singleton02 getInstance() {
        return instance;
    }
}

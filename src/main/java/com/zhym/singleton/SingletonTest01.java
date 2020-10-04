package com.zhym.singleton;

public class SingletonTest01 {

    public static void main(String[] args) {

        Singleton01 instance1 = Singleton01.getInstance();

        Singleton01 instance2 = Singleton01.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1 hashcode ==》" + instance1.hashCode());
        System.out.println("instance2 hashcode ==》" + instance2.hashCode());
    }
}

class Singleton01 {

    /**
     * 饿汉式
     * 问题，instance在类加载时就创建了，可能造成内存浪费
     *
     */
    //1.私有化构造器
    private Singleton01() {

    }

    //2.在本类内部创建对象实例
    private static final Singleton01 instance = new Singleton01();

    //3.提供一个公有的返回实例的静态方法
    public static Singleton01 getInstance() {
        return instance;
    }
}

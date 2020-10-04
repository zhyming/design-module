package com.zhym.singleton;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/26 0026 1:48
 */
public class SingletonTest07 {
    public static void main(String[] args) {

        Singleton07 instance1 = Singleton07.INSTANCE;

        Singleton07 instance2 = Singleton07.INSTANCE;

        System.out.println(instance1 == instance2);
        System.out.println("instance1 hashcode ==》" + instance1.hashCode());
        System.out.println("instance2 hashcode ==》" + instance2.hashCode());
    }
}

/**
 *
 * 使用枚举方式
 *
 */
enum Singleton07 {
    INSTANCE;

    public void say() {
        System.out.println("HHHHHHH......");
    }
}

package com.zhym.proxy.cglib;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/3 0003 0:56
 */
public class Client {

    public static void main(String[] args) {

        //创建目标对象
        TeacherDao target = new TeacherDao();

        //获取代理对象
        TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法，触发intercept方法，从而实现对目标对象的调用
        String name = proxyInstance.teach();

        System.out.println("----------------" + name);
    }
}

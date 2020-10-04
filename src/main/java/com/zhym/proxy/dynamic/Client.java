package com.zhym.proxy.dynamic;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/2 0002 23:46
 */
public class Client {

    public static void main(String[] args) {

        //创建目标对象，Object
        ITeacherDao target = new TeacherDao();

        //给目标对象创建一个代理对象,可以转成target所实现的接口类型，因为创建这个代理对象的时候是实现了它的接口的--getProxyInstance 第二个参数
        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();

        //System.out.println("proxyInstance ---> "  + proxyInstance.getClass());

        //proxyInstance.teach();

        proxyInstance.hello("你好呀呀呀呀呀呀呀呀");
    }
}

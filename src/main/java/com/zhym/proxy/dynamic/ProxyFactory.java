package com.zhym.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: 动态代理工厂
 * @author: zhym
 * @time: 2020/10/2 0002 23:29
 */
public class ProxyFactory {

    //维护一个目标对象，聚合
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成一个代理对象
    public Object getProxyInstance() {

        /**
         *
         * newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler h)
         *
         * 1.loader -- 指定目标对象使用的类加载器，获取加载器方法固定
         * 2.interfaces -- 目标对象实现的接口类型，使用泛型方法确认类型
         * 3.h -- 事件处理，执行目标对象方法时，会触发事件处理器方法，会把当前执行的目标对象方法作为参数传入
         *
         */

        /*return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK 代理开始~~");
                        //反射机制调用目标对象的方法
                        Object result = method.invoke(target, args);

                        return result;
                    }
                }
        );*/

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy,method,args) -> {
                    System.out.println("JDK 代理开始~~");
                    //反射机制调用目标对象的方法
                    Object result = method.invoke(target, args);
                    System.out.println("JDK 代理提交~~");
                return result;
            }
        );
    }

}

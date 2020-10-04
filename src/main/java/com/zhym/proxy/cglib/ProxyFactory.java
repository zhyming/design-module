package com.zhym.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/3 0003 0:34
 */
public class ProxyFactory implements MethodInterceptor {
    //维护的目标对象
    private Object target;

    //传入被代理对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回target的代理对象
    public Object getProxyInstance(){

        //1.创建工具类
        Enhancer enhancer = new Enhancer();

        //2.设置父类
        enhancer.setSuperclass(target.getClass());

        //3.设置回调函数
        enhancer.setCallback(this);

        //4.创建子类，即代理对象
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objs, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib 代理模式开始~~~");

        Object result = method.invoke(target, objs);

        System.out.println("cglib 代理提交");
        return result;
    }
}

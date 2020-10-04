package com.zhym.proxy.cglib;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/3 0003 0:33
 */
public class TeacherDao {

    public String teach() {
        System.out.println("授课中 .....使用cglib代理，不需要实现接口 ");

        return "张三";
    }
}

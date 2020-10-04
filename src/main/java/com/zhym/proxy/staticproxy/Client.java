package com.zhym.proxy.staticproxy;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/2 0002 0:14
 */
public class Client {

    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao dao = new TeacherDao();

        //创建代理对象
        TeacherProxy proxy = new TeacherProxy(dao);

        //通过代理对象，调用被代理对象的方法--即执行代理对象的增强方法
        proxy.teach();
    }
}

package com.zhym.proxy.staticproxy;

/**
 * @description: 代理对象，静态代理
 * @author: zhym
 * @time: 2020/10/2 0002 0:08
 */
public class TeacherProxy implements ITeacherDao {

    private ITeacherDao target; //目标对象（被代理对象），通过接口来聚合

    public TeacherProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        //额外的共同部分由代理对象添加
        System.out.println("Proxying....");
        //核心由被代理对象处理
        target.teach();

        System.out.println("Proxy end .....");
    }
}

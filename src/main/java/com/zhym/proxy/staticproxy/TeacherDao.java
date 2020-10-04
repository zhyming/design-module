package com.zhym.proxy.staticproxy;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/2 0002 0:07
 */
public class TeacherDao  implements ITeacherDao{

    @Override
    public void teach() {
        System.out.println("Teaching。。。。。");
    }
}

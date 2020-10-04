package com.zhym.flyweight;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/1 0001 23:06
 */
public class ConcreteWebSite extends WebSite {

    private String type ="";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {

        System.out.println(user.getName() + "----类型为--》" + type);

    }
}

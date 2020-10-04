package com.zhym.flyweight;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/1 0001 23:15
 */
public class Client {

    public static void main(String[] args) {
        User user = new User();

        user.setName("张三");

        WebSiteFactory factory = new WebSiteFactory();

        WebSite site = factory.getWebSiteCategory("新闻");

        site.use(user);
    }
}

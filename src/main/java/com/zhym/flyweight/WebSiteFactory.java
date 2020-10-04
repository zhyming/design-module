package com.zhym.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/1 0001 23:07
 */
public class WebSiteFactory {

    private Map<String, WebSite> map = new HashMap<>();

    //根据类型，返回，如果没有则创建一个，并放入集合中，返回

    public WebSite getWebSiteCategory(String type) {
        WebSite site = null;
        if (!map.containsKey(type)) {
            site = new ConcreteWebSite(type);
            map.put(type, site);
        }else{
            site = map.get(type);
        }

        return site;
    }

    public int getWebSiteCount() {
        return map.size();
    }
}

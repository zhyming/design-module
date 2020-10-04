package com.zhym.composite;


/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 22:48
 */
public class Client {

    public static void main(String[] args) {

        //从大到小
        OrangizationComponent university = new University("哈哈大学", "很牛皮");

        //下一级
        OrangizationComponent college1 = new College("机学学院", "机机");
        OrangizationComponent college2 = new College("数学学院", "算算");

        //下一级
        college1.add(new Department("网络", "网网网"));
        college1.add(new Department("软件", "软软软"));
        college1.add(new Department("科学", "科科科"));

        college2.add(new Department("概率论", "概概概"));
        college2.add(new Department("线性代数", "线线线"));

        university.add(college1);
        university.add(college2);

        university.print();

    }
}

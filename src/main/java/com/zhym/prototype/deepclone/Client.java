package com.zhym.prototype.deepclone;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/27 0027 23:51
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        DeepPrototype p = new DeepPrototype();

        p.setName("张三");
        p.setTarget(new DeepCloneableTarget("李四", 12));

        //方式一，完成深拷贝
        //DeepPrototype p2 = (DeepPrototype)p.clone();

        //方式二：
        DeepPrototype p2 = (DeepPrototype)p.deepClone();

        System.out.println("1------------" + p.getTarget().hashCode());
        System.out.println("2------------" + p2.getTarget().hashCode());
    }
}

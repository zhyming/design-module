package com.zhym.template;

/**
 * @description: 抽象类，表示豆浆
 * @author: zhym
 * @time: 2020/10/3 0003 23:33
 */
public abstract class SoyaMilk {

    //模板方法设成final，不让子类组覆盖

    final  void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    //材料
    void select() {
        System.out.println("第一步~~~~选材料");
    }

    //配料，抽象方法，子类具体实现
    abstract void addCondiments();

    //浸泡
    void soak() {
        System.out.println("第三步~~~~开始浸泡，要几个钟");
    }

    //
    void beat() {
        System.out.println("第四步~~~，捣碎");
    }
}

package com.zhym.template.improve;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/3 0003 23:41
 */
public class Client {

    public static void main(String[] args) {

        SoyaMilk soyaMilk = new RedBeanSoyaMilk();
        soyaMilk.make();

        System.out.println("==========================");
        SoyaMilk soyaMilk1 = new PeanutSoyaMilk();
        soyaMilk1.make();

        System.out.println("--------------------------------");
        SoyaMilk soyaMilk2 = new PureSoyaMilk();
        soyaMilk2.make();
    }
}

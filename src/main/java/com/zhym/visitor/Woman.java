package com.zhym.visitor;

/**
 * @author zhym
 * @description
 * @crate 2020/10/6 21:33
 */
public class Woman extends Person {
    public void accept(Action action) {

        /**
         *
         * 1.使用双分派，在客户端程序中将具体状态作为参数传递Woman（第一次分派）
         * 2.然后Woman类调用作为参数的具体方法，getResult，将自己作为参数传入进去--第二次分派
         *
         */
        action.getManResult(this);
    }
}

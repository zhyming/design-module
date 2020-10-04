package com.zhym.adapter.interfaceadapter;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/29 0029 0:28
 */
public class Client {

    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter(){
            //只需要去覆盖要使用的接口方法

            @Override
            public void m1() {
                System.out.println("使用m1方法");
            }
        };
        adapter.m1();
    }
}

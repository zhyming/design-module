package com.zhym.visitor;

/**
 * @author zhym
 * @description
 * @crate 2020/10/6 21:34
 */
public class Success extends Action {


    public void getManResult(Man man) {
        System.out.println("Man-------------成功~~~~");
    }

    public void getManResult(Woman woman) {

        System.out.println("Woman----------很成功~~~");
    }
}

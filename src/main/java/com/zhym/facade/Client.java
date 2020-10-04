package com.zhym.facade;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 23:56
 */
public class Client {


    public static void main(String[] args) {
        //直接调用各个设备流程会很麻烦
        //外观模式--建立一个中间外观类--进行统一调用
        HomeTheaterFacade facade = new HomeTheaterFacade();

        facade.ready();

        facade.play();

        facade.pause();

        facade.end();
    }



}

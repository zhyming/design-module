package com.zhym.bridge;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 0:29
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new FolderPhone(new XiaoMi());

        phone.call();
    }
}

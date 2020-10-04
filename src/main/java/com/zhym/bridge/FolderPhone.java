package com.zhym.bridge;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/30 0030 0:25
 */
public class FolderPhone extends Phone {

    public FolderPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("Folder 。。。。open");
    }

    public void close() {
        super.close();
        System.out.println("Folder 。。。。close");
    }

    public void call() {
        super.call();
        System.out.println("Folder 。。。。call");
    }
}

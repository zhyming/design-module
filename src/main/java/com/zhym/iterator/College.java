package com.zhym.iterator;

import java.util.Iterator;

/**
 * @author zhym
 * @description
 * @crate 2020/10/6 22:40
 */
public interface College {

    String getName() ;

    void addDepartment(String name, String des);

    //返回一个迭代器，遍历
    Iterator createIterator();
}

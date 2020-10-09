package com.zhym.iterator;

import java.util.Iterator;

/**
 * @author zhym
 * @description
 * @crate 2020/10/6 22:31
 */
public class ComputerCollegeIterator implements Iterator {

    //这里需要知道department，是以怎样方式存放

    Department[] departments;

    int position = 0; //遍历位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {

        if (position >= departments.length || departments[position] == null) {
            return false;
        }else {
            return true;
        }

    }

    @Override
    public Object next() {

        Department department = departments[position];
        position ++;
        return department;
    }

    @Override
    public void remove() {
        //删除方法空实现
    }
}

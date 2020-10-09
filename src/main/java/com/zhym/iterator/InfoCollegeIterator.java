package com.zhym.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author zhym
 * @description
 * @crate 2020/10/6 22:31
 */
public class InfoCollegeIterator implements Iterator {

    //这里需要知道department，是以怎样方式存放

    List<Department> departments;

    int position = 0; //遍历位置

    public InfoCollegeIterator(List<Department>departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {

        if (position > departments.size() - 1) {
            return false;
        }else {
            return true;
        }

    }

    @Override
    public Object next() {

        Department department = departments.get(position);
        position ++;
        return department;
    }

    @Override
    public void remove() {
        //删除方法空实现
    }
}

package com.zhym.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author zhym
 * @description
 * @crate 2020/10/6 22:54
 */
public class OutputImpl {

    //学院集合
    List<College> colleges;

    public OutputImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    public void PrintCollege() {
        Iterator<College> iterator = colleges.iterator();

        while(iterator.hasNext()) {
            College college = iterator.next();
            System.out.println(college.getName());

            printDepartment(college.createIterator());


        }

    }

    //输出
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}

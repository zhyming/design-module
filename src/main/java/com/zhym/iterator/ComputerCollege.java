package com.zhym.iterator;

import java.util.Iterator;

/**
 * @author zhym
 * @description
 * @crate 2020/10/6 22:42
 */
public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0; //报错当前数字对象个数

    public ComputerCollege() {
        this.departments = new Department[5];

        addDepartment("Java专业", "java知识");
        addDepartment("HTML专业", "HTML知识");
        addDepartment("c++专业", "c++知识");
        addDepartment("PHP专业", "PHP知识");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String des) {

        Department department = new Department(name, des);
        departments[numOfDepartment] = department;

        numOfDepartment ++;

    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}

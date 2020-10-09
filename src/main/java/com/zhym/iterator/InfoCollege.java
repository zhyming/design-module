package com.zhym.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhym
 * @description
 * @crate 2020/10/6 22:42
 */
public class InfoCollege implements College {

    List<Department> departments;

    public InfoCollege() {
        this.departments = new ArrayList();

        addDepartment("信息安全专业", "信息安全知识");
        addDepartment("网络安全专业", "网络安全知识");
        addDepartment("服务器维护专业", "服务器维护知识");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String des) {

        Department department = new Department(name, des);
        departments.add(department);

    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}

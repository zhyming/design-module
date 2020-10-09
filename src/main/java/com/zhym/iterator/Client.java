package com.zhym.iterator;

import java.util.ArrayList;

/**
 * @author zhym
 * @description
 * @crate 2020/10/6 23:02
 */
public class Client {

    public static void main(String[] args) {
        ArrayList<College> colleges = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();

        InfoCollege infoCollege = new InfoCollege();

        colleges.add(computerCollege);
        colleges.add(infoCollege);

        OutputImpl output = new OutputImpl(colleges);
        output.PrintCollege();

    }
}

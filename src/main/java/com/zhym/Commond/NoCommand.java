package com.zhym.Commond;

/**
 * @description: 空执行，用于初始化每个按钮，当调用空命令时对象什么都不做，这是对空判断处理省掉的一种模式
 * @author: zhym
 * @time: 2020/10/5 0005 0:31
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}

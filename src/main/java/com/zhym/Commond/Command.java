package com.zhym.Commond;

/**
 * @description: 命令接口
 * @author: zhym
 * @time: 2020/10/5 0005 0:24
 */
public interface Command {

    //创建动作
    void execute();

    //撤销动作
    void undo();

}

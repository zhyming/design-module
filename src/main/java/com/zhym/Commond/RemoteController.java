package com.zhym.Commond;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/5 0005 0:34
 */
public class RemoteController {

    //执行命令数组
    Command[] onCommands;
    Command[] offCommands;

    //撤销命令
    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i< 5; i ++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //设置具体命令操作
    public void setCommands(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;

    }

    //执行命令
    public void onButtonPushed(int no) {
        //执行对应命令
        onCommands[no].execute();
        //记录执行的命令
        undoCommand = onCommands[no];

    }

    //执行命令
    public void offButtonPushed(int no) {
        //执行对应命令
        offCommands[no].execute();
        //记录执行的命令
        undoCommand = offCommands[no];

    }

    //撤销命令
    public void undoButtonPushed() {
        undoCommand.undo();
    }
}

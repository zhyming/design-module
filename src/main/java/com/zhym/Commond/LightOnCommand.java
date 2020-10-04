package com.zhym.Commond;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/5 0005 0:26
 */
public class LightOnCommand implements Command {


    private LightReceiver receiver;

    public LightOnCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {

        //调用接收者的方法
        receiver.on();
    }

    @Override
    public void undo() {

        receiver.off();
    }
}

package com.zhym.Commond;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/5 0005 0:30
 */
public class LightOffCommand implements Command {

    private LightReceiver receiver;

    public LightOffCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.off();
    }

    public void undo() {

        receiver.on();
    }
}

package com.zhym.Commond;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/5 0005 0:44
 */
public class Client {
    public static void main(String[] args) {
        //
        LightReceiver receiver = new LightReceiver();

        LightOnCommand onCommand = new LightOnCommand(receiver);

        LightOffCommand offCommand = new LightOffCommand(receiver);

        RemoteController controller = new RemoteController();

        controller.setCommands(0, onCommand, offCommand);

        System.out.println("=====================");

        controller.onButtonPushed(0);

        controller.offButtonPushed(0);

        controller.undoButtonPushed();
    }
}

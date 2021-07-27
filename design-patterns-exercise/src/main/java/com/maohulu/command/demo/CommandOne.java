package com.maohulu.command.demo;

/**
 * @author hul on 2021/7/20 11:40
 */
public class CommandOne implements Command {

    /**
     * 接受者，这里可以理解为公公
     */
    private Receiver receiver;

    public CommandOne(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 收取奏折
        receiver.charge();
    }
}

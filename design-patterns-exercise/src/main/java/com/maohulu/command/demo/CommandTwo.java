package com.maohulu.command.demo;

/**
 * @author hul on 2021/7/20 11:44
 */
public class CommandTwo implements Command {
    /**
     * 接受者，这里可以理解为公公
     */
    private Receiver receiver;

    public CommandTwo(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 颁布圣旨
        receiver.issue();
    }
}

package com.maohulu.command.demo;

/**
 * @author hul on 2021/7/20 11:45
 * 类比 皇帝
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 本次需要执行的命令
     */
    public void action() {
        command.execute();
    }
}

package com.maohulu.command.demo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hul on 2021/7/20 22:20
 */
public class Demo {
    public static void main(String[] args) {
        // 实例化一个公公 接收者
        Receiver receiver = new Receiver();

        // 公公 当前能有接收到的几种命令
        Command commandOne = new CommandOne(receiver);
        Command commandTwo = new CommandTwo(receiver);

        // 皇帝 发号命令 触发执行方法
        Invoker invoker = new Invoker(commandOne);
        invoker.action();
        // result: 收取奏折

        Invoker invokerTwo = new Invoker(commandTwo);
        invokerTwo.action();
        // result：颁布圣旨

        // 存储命令
        Queue<Command> queue = new LinkedList<Command>();
        queue.add(commandOne);
        queue.add(commandTwo);
        // 批量执行
        for (Command command : queue) {
            Invoker invokerQueue = new Invoker(command);
            invoker.action();
        }

    }
}

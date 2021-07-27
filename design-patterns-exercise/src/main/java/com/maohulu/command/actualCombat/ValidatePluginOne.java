package com.maohulu.command.actualCombat;

import org.springframework.stereotype.Component;

/**
 * @author hul on 2021/7/20 22:53
 */
@Component("validatePluginOne")
public class ValidatePluginOne extends ValidatePlugin {

    @Override
    public void validate() {
        System.out.println("validatePluginOne 规则校验");
    }
}

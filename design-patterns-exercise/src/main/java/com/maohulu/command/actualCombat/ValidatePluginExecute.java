package com.maohulu.command.actualCombat;

import cn.hutool.core.collection.CollectionUtil;

import java.util.List;

/**
 * @author hul on 2021/7/20 22:46
 *
 * 抽象规则执行器
 */
public abstract class ValidatePluginExecute {

    protected abstract List<ValidatePlugin> getValidatePlugins();

    public void execute() {
        final List<ValidatePlugin> validatePlugins = getValidatePlugins();

        if (CollectionUtil.isEmpty(validatePlugins)) {
            return;
        }

        for (ValidatePlugin validatePlugin : validatePlugins) {
            // 执行校验逻辑，这里大家可以根据自己的实际业务场景改造
            validatePlugin.validate();
        }

    }
}

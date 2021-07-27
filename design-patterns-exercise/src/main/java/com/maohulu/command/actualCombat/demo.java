package com.maohulu.command.actualCombat;

import cn.hutool.core.io.FileUtil;
import cn.hutool.json.JSONUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * @author hul on 2021/7/22 18:39
 */
public class demo {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        TestValidatePlugin testValidatePlugin = (TestValidatePlugin) applicationContext.getBean("testValidatePlugin");
//        testValidatePlugin.execute();

        File file = new File("D:\\IDEA\\koal\\gw-cloud-pps\\src\\test\\resources\\demo.json");
        String config1 = FileUtil.readString(file, UTF_8);

        Object byPath = JSONUtil.getByPath(JSONUtil.parse(config1), "admin.passwordPolicy");
    }
}

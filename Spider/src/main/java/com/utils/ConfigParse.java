package com.utils;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.vo.ConditionVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;


/**
 * Created by Gene on 2017/7/28.
        */
public class ConfigParse {
    private static final Logger logger = LoggerFactory.getLogger(ConfigParse.class);
    private static Config localConfig = null;

    //是否从前台改变配置参数
    //前台直接用model形式传递


/*    private static Config getConfig(Config webConfig ){
        int maxTotal = Integer.parseInt(properties.getProperty("esPool.maxTotal", config.getString("maxTotal")));

        return localConfig.getConfig(key);
    }*/

    /**
     * 读取配置文件(application.conf)中的参数
     *
     * @throws Exception
     */
    private static void loadConfig() throws Exception{
        File configurationFile = new File("path");
        String path = configurationFile.getPath();
        try {
            path = configurationFile.getCanonicalPath();
            logger.info("load config file:{}");
            //执行了什么操作？
            localConfig = ConfigFactory.parseFile(new File(path));
            localConfig.atKey("");
            localConfig.getConfig("");
        }catch (IOException e){
            logger.error("Failed to read canonical path for file: {}", path, e);
            throw e;
        }
    }

    public static Config getConfig(String key){
        return localConfig.getConfig(key);
    }


}

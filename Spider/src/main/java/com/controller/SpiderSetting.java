package com.controller;

import com.Spider;
import com.vo.SpiderConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Gene on 2017/8/1.
 */
public class SpiderSetting {
    private static final Logger logger = LoggerFactory.getLogger(SpiderSetting.class);
    public SpiderSetting(){
        //读取配置文件
    }
    public SpiderSetting(SpiderConfig spiderConfig){
        //若不同，替换配置文件
    }
}

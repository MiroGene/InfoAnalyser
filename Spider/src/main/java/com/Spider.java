package com;

import com.vo.ConditionVo;

/**
 * Created by Gene on 2017/7/28.
 * 控制整体程序的运行
 */
public class Spider {


    private ConditionVo conditionVoObject;
    private String  conditionVoJson;
    //传递对象
    public Spider(ConditionVo conditionVo){
        this.conditionVoObject = conditionVo;
    }
    //模块间以json传递参数（需解析）
    public Spider(String conditionVoJson){
        this.conditionVoJson = conditionVoJson;
    }
    //使用默认配置（需要读取配置文件）
    public Spider(){

    }
    public static void main(String[] args) {
        //获取消费者

    }

}

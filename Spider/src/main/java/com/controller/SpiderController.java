package com.controller;

import cn.edu.hfut.dmic.webcollector.model.CrawlDatums;
import cn.edu.hfut.dmic.webcollector.model.Page;
import cn.edu.hfut.dmic.webcollector.plugin.berkeley.BreadthCrawler;
import com.service.OriginalDataService;
import com.service.impl.OriginalDataServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

/**
 * Created by Administrator on 2017/7/17.
 */
public class SpiderController extends BreadthCrawler {
    /**
     * allocate work
     */
    private static final Logger logger = LoggerFactory.getLogger(SpiderController.class);


    public SpiderController(String crawlPath, boolean autoParse) {
        super(crawlPath, autoParse);
    }


    public void initializeSpider(){
        //html源码获取(文件下载)
        //文件操作
        //html源码解析(数据清洗)
        //线程池
        //URL生成器(遍历器)
        //消息机制(各组件通信)
        /*start page*/
        this.addSeed("http://news.hfut.edu.cn/list-1-1.html");
        /*fetch url like http://news.hfut.edu.cn/show-xxxxxxhtml*/
        this.addRegex("http://news.hfut.edu.cn/show-.*html");
        /*do not fetch jpg|png|gif*/
        this.addRegex("-.*\\.(jpg|png|gif).*");
        /*do not fetch url contains #*/
        this.addRegex("-.*#.*");

    }

    public static void main(String[] args) {

    }

    /**
     * 分配工作
     */
    public void allocateWork(){
        //新建一个webcollector

        //allocate thread
        //control the visit url
        //begin fetcher(if fetcher fail, control the visit url)
        //saveOriginalData
        OriginalDataService  ods = new OriginalDataServiceImpl();


        //begin parse
        //save parsed data



    }
    @Override
    public void visit(Page page, CrawlDatums crawlDatums) {

    }
}

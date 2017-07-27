package com.controller;

import com.service.OriginalDataService;
import com.service.impl.OriginalDataServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

/**
 * Created by Administrator on 2017/7/17.
 */
public class SpiderController {
    /**
     * allocate work
     */
    private static final Logger logger = LoggerFactory.getLogger(SpiderController.class);
    public void allocateWork(){
        //allocate thread
        //control the visit url
        //begin fetcher(if fetcher fail, control the visit url)
        //saveOriginalData
        OriginalDataService  ods = new OriginalDataServiceImpl();


        //begin parse
        //save parsed data



    }
}

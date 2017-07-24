package com.controller.threadtest;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/7/20.
 */
public class ExecutorTest {
    public static void main(String[] args) {
/*        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i=0;i<5;i++){
            exec.execute(new LifeOff());
        }*/
    ExecutorService exec = Executors.newCachedThreadPool();
    for(int i=0;i<5;i++){


        exec.execute(new LifeOff(1,Thread.MIN_PRIORITY));
        exec.execute(new LifeOff(1,Thread.MAX_PRIORITY));
    }
        exec.shutdown();
    }
}

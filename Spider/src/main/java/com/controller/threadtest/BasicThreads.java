package com.controller.threadtest;

/**
 * Created by Administrator on 2017/7/19.
 */
public class BasicThreads {
    public static void main(String[] args) {
        for (int i=0;i<3;i++){
            new Thread(new LifeOff(4,4)).start();
            System.out.println("Waiting for LifeOff");
        }

    }
}

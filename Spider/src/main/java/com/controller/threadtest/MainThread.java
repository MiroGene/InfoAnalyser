package com.controller.threadtest;

/**
 * Created by Administrator on 2017/7/19.
 */
public class MainThread {
    public static void main(String[] args) {
        LifeOff launch = new LifeOff();
        LifeOff launch1 = new LifeOff();
        launch.run();
        launch1.run();
    }
}

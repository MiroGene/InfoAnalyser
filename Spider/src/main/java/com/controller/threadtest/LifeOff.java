package com.controller.threadtest;

import static java.lang.Thread.sleep;

/**
 * Created by Administrator on 2017/7/19.
 */
public class LifeOff implements Runnable{
    //资源数量。
    protected int countDown = 5;
    private static int taskCount = 0;
    private final int id = taskCount++;
    private int n1=1;
    private int n2=2;
    private int priority;
    public LifeOff(){
    }
    public LifeOff(int countDown,int priority){
        this.countDown = countDown;
        this.priority = priority;
    }
    public String status(){
        return "#"+ id + "(" + (countDown > 0?countDown:"Liftoff!")+countDown+"),"+id+"号线程; 优先级="+priority;
    }
    public int getFibonacci(){
        int n;
        n=n1;
        n1=n2;
        n2=n+n1;
        return n2;
    }

    public void run(){
        Thread.currentThread().setPriority(priority);
        while (countDown-- > 0){
/*            if (id%2==0){
                try {
                    sleep(1);
                    System.out.println("sleeping");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }*/
           // System.out.println(getFibonacci());
            System.out.println(status());
/*            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            Thread.yield();

        }
    }
}

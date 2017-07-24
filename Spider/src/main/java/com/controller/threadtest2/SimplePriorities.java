package com.controller.threadtest2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/7/20.
 */
public class SimplePriorities implements Runnable {
    private int countDown = 5;
    private static int id=0;
    private volatile double d;//no optimization 非最优化
    private int priority;

    public SimplePriorities(int priority){
        this.id++;
        this.priority = priority;
    }
    public String toString(){
        return Thread.currentThread()+":"+countDown+"  "+this;
    }

    public void run() {
        Thread.currentThread().setPriority(priority);
        while (true){
            for (int i=1;i<100000;i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0)
                    Thread.yield();
            }
                System.out.println(this);
                if(--countDown == 0)return;
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i=0;i<5;i++){
            exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
            exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
            exec.shutdown();
        }
    }
}

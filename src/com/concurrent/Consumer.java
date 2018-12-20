package com.concurrent;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * 消费者
 */
public abstract class Consumer extends Thread{
    protected LinkedBlockingDeque<Integer> linkedBlockingDeque;
    public Consumer(LinkedBlockingDeque<Integer> linkedBlockingDeque){
        this.linkedBlockingDeque = linkedBlockingDeque;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------------------");
        while(true){
            try {
                System.out.println("尾部等待3秒开始获取产品");
                Thread.sleep(3000);
                this.takeQueue();//获取数据
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public abstract void takeQueue() throws InterruptedException;
}

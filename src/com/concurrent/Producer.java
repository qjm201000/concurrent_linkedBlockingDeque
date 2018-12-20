package com.concurrent;

import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 生产者
 */
public abstract class Producer extends Thread{
    protected LinkedBlockingDeque<Integer> linkedBlockingDeque;
    public Producer(LinkedBlockingDeque<Integer> linkedBlockingDeque){
        this.linkedBlockingDeque = linkedBlockingDeque;
    }

    @Override
    public void run() {
        while(true){
            int random = new Random().nextInt(1000);
            try {
                this.putQueue(random);//插入数据
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public abstract void putQueue(int random) throws InterruptedException;
}

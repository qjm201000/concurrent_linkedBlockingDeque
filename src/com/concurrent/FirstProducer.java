package com.concurrent;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * 头部插入
 */
public class FirstProducer extends Producer{
    public FirstProducer(LinkedBlockingDeque<Integer> linkedBlockingDeque) {
        super(linkedBlockingDeque);
    }

    @Override
    public void putQueue(int random) throws InterruptedException {
        System.out.println("头部生产产品："+random);
        super.linkedBlockingDeque.putFirst(random);
        System.out.println("头部生产产品："+random+",结束");
    }
}

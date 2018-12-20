package com.concurrent;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * 头部获取
 */
public class FirstConsumer extends Consumer{
    public FirstConsumer(LinkedBlockingDeque<Integer> linkedBlockingDeque) {
        super(linkedBlockingDeque);
    }

    @Override
    public void takeQueue() throws InterruptedException {
        System.out.println("头部获取产品开始");
        Integer random = super.linkedBlockingDeque.takeFirst();
        System.out.println("头部获取产品："+random+",结束");
    }
}

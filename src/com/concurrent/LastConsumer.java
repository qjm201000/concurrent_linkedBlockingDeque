package com.concurrent;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * 尾部获取
 */
public class LastConsumer extends Consumer{
    public LastConsumer(LinkedBlockingDeque<Integer> linkedBlockingDeque) {
        super(linkedBlockingDeque);
    }

    @Override
    public void takeQueue() throws InterruptedException {
        Integer random = super.linkedBlockingDeque.takeLast();
        System.out.println("尾部获取产品："+random+",结束");
    }
}

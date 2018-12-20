package com.concurrent;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * 尾部插入：默认是尾部插入
 */
public class LastProducer extends Producer{
    public LastProducer(LinkedBlockingDeque<Integer> linkedBlockingDeque) {
        super(linkedBlockingDeque);
    }

    @Override
    public void putQueue(int random) throws InterruptedException {
        super.linkedBlockingDeque.putLast(random);
    }
}

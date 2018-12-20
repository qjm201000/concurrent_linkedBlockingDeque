package com.concurrent;

import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {
        //给个3的队列
        LinkedBlockingDeque<Integer> linkedBlockingDeque = new LinkedBlockingDeque<Integer>(3);

        //生产者
        Producer firstProducer = new FirstProducer(linkedBlockingDeque);//头部插入
        Producer lastProducer = new LastProducer(linkedBlockingDeque);//尾部插入
        firstProducer.start();
//        lastProducer.start();


        //消费者
        Consumer firstConsumer = new FirstConsumer(linkedBlockingDeque);//头部获取
        Consumer lastConsumer = new LastConsumer(linkedBlockingDeque);//尾部获取
//        firstConsumer.start();
        lastConsumer.start();

    }
}

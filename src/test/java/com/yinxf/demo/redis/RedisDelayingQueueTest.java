package com.yinxf.demo.redis;

import redis.clients.jedis.Jedis;

/**
 * @author yinxf
 * @Date 2019/3/6
 * @Description
 **/
public class RedisDelayingQueueTest {

//    public void test() {
//        Jedis jedis = new Jedis();
//        final RedisDelayingQueue queue = new RedisDelayingQueue(jedis,"q-demo");
//        Thread producer = new Thread(){
//            @Override
//            public void run() {
//                for (int i=0;i<10;i++) {
//                    queue.delay("codehole" + i);
//                }
//            }
//        };
//
//        Thread consumer = new Thread(){
//            @Override
//            public void run() {
//                queue.loop();
//            }
//        };
//
//        producer.start();
//        consumer.start();
//
//        try {
//            producer.join();
//            Thread.sleep(6000);
//            consumer.interrupt();
//            consumer.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
}

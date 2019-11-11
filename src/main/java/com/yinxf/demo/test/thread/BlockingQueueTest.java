package com.yinxf.demo.test.thread;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author yinxf
 * @Date 2019/9/16
 * @Description
 **/
public class BlockingQueueTest {
    private int queueSize = 10;

    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(queueSize);

    public static void main(String[] args) {
        BlockingQueueTest test = new BlockingQueueTest();

        Producer producer = test.new Producer();
        Consumer consumer = test.new Consumer();

        producer.start();
        consumer.start();
    }

    class Consumer extends Thread{
        @Override
        public void run() {
            consume();
        }
        private void consume(){
            while (true){
                try {
                    queue.take();
                    System.out.println("从队列取走一个元素，剩余："+queue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Producer extends Thread{
        @Override
        public void run() {
            produce();
        }
        private void produce(){
            while (true){
                try {
                    queue.put(1);
                    System.out.println("向队列中添加一个元素，队列剩余空间："+(queueSize - queue.size()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

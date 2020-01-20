package com.yinxf.practice.rabbitmq;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author yinxf
 * @Date 2019/10/16
 * @Description
 **/
public class RabbitConsumer {
    private static final String QUEUE_NAME = "queue_demo";
    private static final String IP_ADDRESS = "192.168.153.128";
    private static final int PORT = 5672;

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        System.out.println("开始发送。。。");
        Address[] addresses = new Address[]{new Address(IP_ADDRESS,PORT)};

        ConnectionFactory factory = new ConnectionFactory();
        factory.setUsername("yinxf");
        factory.setPassword("yinxf");
        //创建连接
        Connection connection = factory.newConnection(addresses);
        //创建信道
        Channel channel = connection.createChannel();
        //设置客户端最多接收未被ack的消息的个数
        channel.basicQos(64);
        Consumer consumer = new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("recv message:"+new String(body));
//                try {
//                    TimeUnit.SECONDS.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                channel.basicAck(envelope.getDeliveryTag(),false);
            }
        };

        channel.basicConsume(QUEUE_NAME,consumer);
//        TimeUnit.SECONDS.sleep(5);
//
        channel.close();
        connection.close();
        System.out.println("发送结束！！！");
    }
}

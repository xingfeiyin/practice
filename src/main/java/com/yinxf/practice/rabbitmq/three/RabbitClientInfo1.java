package com.yinxf.practice.rabbitmq.three;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.GetResponse;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;

/**
 * @author yinxf
 * @Date 2020/1/19
 * @Description
 **/
public class RabbitClientInfo1 {

    private static final String EXCHANGE_NAME = "exchange_demo";
    private static final String ROUTING_KEY = "routingkey_demo";
    private static final String QUEUE_NAME = "queue_demo";
    private static final String IP_ADDRESS = "192.168.153.128";
    private static final int PORT = 5672;

    public static void main(String[] args) throws IOException, TimeoutException, NoSuchAlgorithmException, KeyManagementException, URISyntaxException {
        /**
         * 1、连接rabbitmq
         */
        //用在给定的参数下连接rabbit
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUsername("yinxf");
        factory.setPassword("yinxf");
        factory.setVirtualHost(IP_ADDRESS);
        factory.setPort(PORT);
        Connection conn = factory.newConnection();


        //使用URI的方式
        ConnectionFactory factory1 = new ConnectionFactory();
        factory1.setUri("amqp://yinxf:yinxf@192.168.153.128:5672/virtualhost");
        Connection connection = factory1.newConnection();

        //connection用来创建一个channel
        Channel channel = connection.createChannel();
        //创建channel可以用来发送或接收消息。

        /**
         * 2、使用交换器和队列
         */
        //声明一个交换器和队列
        /**
         * 创建一个持久化的、非自动删除的、绑定类型为direct的交换器
         * 也创建一个非持久化的、排他的、自动删除的队列
         */
        channel.exchangeDeclare(EXCHANGE_NAME,"direct",true);
        String queueName = channel.queueDeclare().getQueue();
        channel.queueBind(queueName,EXCHANGE_NAME,ROUTING_KEY);

        //在应用中共享一个队列
        /**
         * 队列时持久化的、非排他的、非自动删除的
         */
        channel.exchangeDeclare(EXCHANGE_NAME,"direct",true);
        channel.queueDeclare(QUEUE_NAME,true,false,false,null);
        channel.queueBind(queueName,EXCHANGE_NAME,ROUTING_KEY);

        /**
         * 3.exchangeDeclare方法详解
         *  Exchange.DeclareOk  exchangeDeclare(String exchange,String type,boolean durable,boolean autoDelete,
         *                                  boolean internal,Map<String,Object> arguments) throw IOException;
         *
         * exchange:交换器的名称。
         * type：交换器的类型，常见的如fanout、direct、topic
         * durable：设置是否持久化，true表示持久化，false非持久化。
         * autoDelte：设置是否自动删除。true表示自动删除。自动删除的前提是至少有一个队列或者交换器与这个交换器绑定，之后所有与这个
         *          交换器绑定的队列或交换器都与此解绑。
         * internal：设置是否是内置的，true表示是内置的交换器，客户端无法直接发送消息到这个交换器中，只能通过交换器路由到交换器。
         * arguments：其他一些结构化参数
         */

        /**
         * 4.queueDeclare方法详解
         *
         * Queue . DeclareOk queueDec1are() throws IOException;
         * 不带任何参数的queueDeclare方法默认创建一个由rabbitmq命名的、排他的、自动删除的、非持久化的队列。
         *
         *  Queue. DeclareOk queueDeclare (String queue , boolean durable , boolean exclusive,
         *                      boolean autoDelete, Map<String,Object> arguments) throws IOException;
         * queue：队列的名称。
         * durable：设置是否持久化，true为持久化。
         * exclusive:设置是否排他，true为排他的。如果是排他队列，该队列仅对首次声明它的连接可见，并在连接断开时自动删除
         *   需要注意三点：
         *   排他队列时基于连接可见的，同一个连接的不同信道是可以同时访问同一连接创建的排他队列；
         *   “首次”是指如果一个连接已经声明了一个排他队列，其他连接是不允许建立同名的排他队列的；
         *   即使队列是持久化的，一旦连接关闭或客户端退出，该排他队列都会被自动删除。
         * autoDelete：设置是否自动删除，true为自动删除。自动删除的前提是至少有一个消费者连接到这个队列，之后所有与这个队列连接的
         *      消费者都断开时，才会自动删除。
         * arguments：设置队列的其他一些参数。
         *
         * 注意：生产者和消费者都能使用queueDeclare来声明一个队列，如果消费者在同一个信道上订阅了另一个队列，就无法再声明队列了，
         *      必须先取消订阅，然后将信道置为“传输”模式，之后才能声明队列。
         *
         */


        /**
         * 5.queueBind方法详解
         * 将队列和交换器绑定的方法
         *
         * Queue.BindOk queueBind(String queue , String exchange , String routingKey) throws IOException ;
         *
         * Queue.BindOk queueBind(String queue , String exchange , String routingKey,
         *                          Map<String, Object> arguments) throws IOException;
         *
         * void queueBindNoWait(String queue , String exchange, String routingKey,
         *                          Map<String, Object> arguments) throws IOException ;
         *
         * queue:队列名称。
         * exchange：交换器名称
         * routingKey：用来绑定队列和交换器的路由键
         * argument：定义绑定的一些参数。
         */

        /**
         * 6.exchangeBind方法详解
         *  可以将交换器与交换器绑定
         *
         * Exchange.BindOk exchangeBind(String destination , String source , String routingKey) throws IOException;
         *
         * Exchange.BindOk exchangeBind(String destination , String source, String routingKey,
         *                          Map<String, Object> arguments) throws IOException ;
         *
         * void exchangeBindNoWait(String destination, String source , String routingKey,
         *                          Map<String, Object> arguments) throws IOException;
         */

        /**
         * 7.rabbitmq的消费模式分为两种：推（push）模式和拉（pull）模式，推模式采用basic.consume进行消费，拉模式是调用basic.get进行消费。
         *
         * 推模式：
         *
         * channel类中basicConsume方法：
         * String basicConsume(String queue , Consumer callback) throws IOException ;
         * String basicConsume(String queue ， boolean autoAck, Consumer callback) throws IOException ;
         * String basicConsume(String queue , boolean autoAck, Map<String, Object> arguments ,
         *                  Consumer callback) throws IOException ;
         * String basicConsume(String queue , boolean autoAck, String consumerTag,
         *                      Consumer callback) throws IOException ;
         * String basicConsume(String queue , boolean autoAck, String consumerTag,boolean noLocal ,
         *          boolean exclusive, Map<String,Object> arguments , Consumer callback) throws IOException ;
         * queue:队列名称
         * autoAck:设置是否自动确认。建议设置成false，即不自动确认。
         * consumerTag:消费者标签，用来区分多个消费者。
         * noLocal：设置为true则表示不能将同一个Connection中生产者发送的消息传送给这个connection中的消费者。
         * exclusive：设置是否排他。
         * arguments:设置消费者的其他参数
         * callback：设置消费者的回调函数。
         *
         */

        /**
         * 8.拉模式
         * 通过channel.basicGet方法获取单条消息，其返回值是GetRespone。
         * GetResponse basicGet(String queue , boolean autoAck) throws IOException;
         */
        GetResponse response = channel.basicGet(QUEUE_NAME, false);
        System.out.println(new String(response.getBody()));
        channel.basicAck(response.getEnvelope().getDeliveryTag(),false);


        /**
         * 9.消费端的确认与拒绝
         *
         */


    }
}

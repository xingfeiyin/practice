package com.yinxf.practice.redis;

import org.springframework.stereotype.Repository;

/**
 * @author yinxf
 * @Date 2019/3/6
 * @Description
 **/
@Repository
public class RedisDelayingQueue {
//    static class TaskItem{
//        public String id;
//        public Object msg;
//    }
//
//    private Type taskType = new TypeReference<TaskItem>(){}.getType();
//    private Jedis jedis ;
//    private String queueKey;
//
//    public RedisDelayingQueue(Jedis jedis, String queueKey) {
//        this.jedis = jedis;
//        this.queueKey = queueKey;
//    }
//
//    public void delay(Object msg){
//        TaskItem task = new TaskItem();
//        task.id = UUID.randomUUID().toString();
//        task.msg = msg ;
//        String s = JSON.toJSONString(task);
//        jedis.zadd(queueKey,System.currentTimeMillis()+5000,s);
//    }
//
//    public void loop(){
//        while (!Thread.interrupted()){
//            Set values = jedis.zrangeByScore(queueKey,0,System.currentTimeMillis(),0,1);
//            if (values.isEmpty()){
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    break;
//                }
//                continue;
//            }
//            String s = (String) values.iterator().next();
//            if (jedis.zrem(queueKey,s) > 0){
//                TaskItem taskItem = JSON.parseObject(s,taskType);
//                this.handleMsg(taskItem.msg);
//            }
//        }
//    }
//
//    public void handleMsg(Object msg){
//        System.out.println(msg);
//    }


}

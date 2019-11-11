package com.yinxf.practice.redis;

import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author yinxf
 * @Date 2019/3/14
 * @Description
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.yinxf.practice.mapper")
public class RedisDataTest {

//    @Autowired
//    private RedisService redisService;
//
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    @TestModel
//    public void insertRedis(){
//        for (int i = 0; i < 1; i++) {
//            redisTemplate.delete("key");
//        }
//
////        Boolean key0 = redisTemplate.delete("key0");
//        System.out.println("执行结束");
//    }
}

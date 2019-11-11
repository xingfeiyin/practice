package com.yinxf.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author yinxf
 * @Date 2019/3/6
 * @Description
 **/
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate  redisTemplate(RedisConnectionFactory factory){
        RedisTemplate<String,Object> redisTemplate = new RedisTemplate();
        redisTemplate.setConnectionFactory(factory);
        return redisTemplate;
    }
}

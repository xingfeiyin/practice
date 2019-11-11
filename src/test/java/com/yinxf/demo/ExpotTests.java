package com.yinxf.demo;


import com.yinxf.demo.service.NsTempService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.yinxf.demo.mapper")
public class ExpotTests {
    @Autowired
    private NsTempService nsTempService;


    @Test
    public void testUserInfo() {


    }


}


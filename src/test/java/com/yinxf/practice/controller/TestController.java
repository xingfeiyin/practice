package com.yinxf.practice.controller;

import com.yinxf.practice.model.TestModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yinxf
 * @Date 2019/4/8
 * @Description
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.yinxf.practice.mapper")
public class TestController {

    @Test
    public void testPost(){
        TestModel test = new TestModel();
        test.setDepo("depo");
        List<String> list = new ArrayList<>(2);
        list.add("name");
        list.add("sex");
        test.setNames(list);



    }
}

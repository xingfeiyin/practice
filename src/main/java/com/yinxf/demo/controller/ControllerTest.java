package com.yinxf.demo.controller;

import com.alibaba.fastjson.JSON;
import com.yinxf.demo.model.TestModel;
import com.yinxf.demo.utils.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yinxf
 * @Date 2019/4/8
 * @Description
 **/
@Controller
@RequestMapping("/test")
public class ControllerTest {

    @RequestMapping("/post")
    public void post(TestModel testModel){
        System.out.println(JSON.toJSONString(testModel));
    }

    @RequestMapping("/security")
    @ResponseBody
    public String security(String name){
        System.out.println("name======="+name);
        return SecurityUtils.decrypt(name);
    }
}

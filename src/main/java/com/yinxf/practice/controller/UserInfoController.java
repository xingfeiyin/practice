package com.yinxf.practice.controller;

import com.alibaba.fastjson.JSON;
import com.yinxf.practice.model.UserInfo;
import com.yinxf.practice.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yinxf
 * @Date 2019/1/18
 * @Description
 **/
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/queryUserInfo")
    @ResponseBody
    public String queryUserInfo(){
        UserInfo userInfo = userInfoService.selectUserInfo(1);
        return JSON.toJSONString(userInfo);
    }
}

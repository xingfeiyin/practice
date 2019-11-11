package com.yinxf.practice.service;

import com.alibaba.fastjson.JSON;
import com.yinxf.practice.mapper.UserInfoMapper;
import com.yinxf.practice.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yinxf
 * @Date 2019/1/17
 * @Description
 **/
@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo selectUserInfo(int id){
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        System.out.println("第一次查询："+JSON.toJSONString(userInfo));
        System.out.println("---------------------------------------------");
        UserInfo userInfo1 = userInfoMapper.selectByPrimaryKey(id);
        System.out.println("第二次查询："+JSON.toJSONString(userInfo1));
        return userInfo;
    }

//    public UserInfo selectByName(String name,String sex){
//        return userInfoMapper.selectByName(name,sex);
//    }
}

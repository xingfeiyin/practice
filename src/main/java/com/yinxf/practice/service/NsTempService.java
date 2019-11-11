package com.yinxf.practice.service;

import com.yinxf.practice.mapper.NsTempMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yinxf
 * @Date 2019/1/31
 * @Description
 **/
@Service
public class NsTempService {

    @Autowired
    private NsTempMapper nsTempMapper;

//    public List<NsTemp> selectTempList(int pageNum,int count){
//        return nsTempMapper.selectByLimit(pageNum,count);
//    }
}

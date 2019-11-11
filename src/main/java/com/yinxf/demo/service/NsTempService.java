package com.yinxf.demo.service;

import com.yinxf.demo.mapper.NsTempMapper;
import com.yinxf.demo.model.NsTemp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

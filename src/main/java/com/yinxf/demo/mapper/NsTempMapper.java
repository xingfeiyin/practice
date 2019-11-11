package com.yinxf.demo.mapper;

import com.yinxf.demo.model.NsTemp;
import com.yinxf.demo.model.NsTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NsTempMapper {
    int deleteByPrimaryKey(String userId);

    int insert(NsTemp record);

    int insertSelective(NsTemp record);

    List<NsTemp> selectByExample(NsTempExample example);

    NsTemp selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") NsTemp record, @Param("example") NsTempExample example);

    int updateByExample(@Param("record") NsTemp record, @Param("example") NsTempExample example);

    int updateByPrimaryKeySelective(NsTemp record);

    int updateByPrimaryKey(NsTemp record);
}
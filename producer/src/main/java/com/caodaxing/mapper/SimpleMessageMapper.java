package com.caodaxing.mapper;

import com.caodaxing.entity.SimpleMessage;
import com.caodaxing.entity.SimpleMessageExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SimpleMessageMapper {
    long countByExample(SimpleMessageExample example);

    int deleteByExample(SimpleMessageExample example);

    int deleteByPrimaryKey(String id);

    int insert(SimpleMessage record);

    int insertSelective(SimpleMessage record);

    List<SimpleMessage> selectByExample(SimpleMessageExample example);

    SimpleMessage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SimpleMessage record, @Param("example") SimpleMessageExample example);

    int updateByExample(@Param("record") SimpleMessage record, @Param("example") SimpleMessageExample example);

    int updateByPrimaryKeySelective(SimpleMessage record);

    int updateByPrimaryKey(SimpleMessage record);
}
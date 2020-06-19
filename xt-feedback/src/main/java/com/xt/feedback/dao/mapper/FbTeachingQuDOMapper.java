package com.xt.feedback.dao.mapper;

import com.xt.feedback.dao.model.FbTeachingQuDO;
import com.xt.feedback.dao.model.FbTeachingQuDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FbTeachingQuDOMapper {
    long countByExample(FbTeachingQuDOExample example);

    int deleteByExample(FbTeachingQuDOExample example);

    int deleteByPrimaryKey(Integer tchQuId);

    int insert(FbTeachingQuDO record);

    int insertSelective(FbTeachingQuDO record);

    List<FbTeachingQuDO> selectByExample(FbTeachingQuDOExample example);

    FbTeachingQuDO selectByPrimaryKey(@Param("tchQuId") Integer tchQuId, @Param("resultColumns") Object resultColumns);

    int updateByExampleSelective(@Param("record") FbTeachingQuDO record, @Param("example") FbTeachingQuDOExample example);

    int updateByExample(@Param("record") FbTeachingQuDO record, @Param("example") FbTeachingQuDOExample example);

    int updateByPrimaryKeySelective(FbTeachingQuDO record);

    int updateByPrimaryKey(FbTeachingQuDO record);
}
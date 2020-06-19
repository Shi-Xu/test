package com.xt.feedback.dao.mapper;

import com.xt.feedback.dao.model.FbTeachingDO;
import com.xt.feedback.dao.model.FbTeachingDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FbTeachingDOMapper {
    long countByExample(FbTeachingDOExample example);

    int deleteByExample(FbTeachingDOExample example);

    int deleteByPrimaryKey(Integer teachingId);

    int insert(FbTeachingDO record);

    int insertSelective(FbTeachingDO record);

    List<FbTeachingDO> selectByExample(FbTeachingDOExample example);

    FbTeachingDO selectByPrimaryKey(@Param("teachingId") Integer teachingId, @Param("resultColumns") Object resultColumns);

    int updateByExampleSelective(@Param("record") FbTeachingDO record, @Param("example") FbTeachingDOExample example);

    int updateByExample(@Param("record") FbTeachingDO record, @Param("example") FbTeachingDOExample example);

    int updateByPrimaryKeySelective(FbTeachingDO record);

    int updateByPrimaryKey(FbTeachingDO record);
}
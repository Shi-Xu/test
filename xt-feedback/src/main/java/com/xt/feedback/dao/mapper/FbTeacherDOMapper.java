package com.xt.feedback.dao.mapper;

import com.xt.feedback.dao.model.FbTeacherDO;
import com.xt.feedback.dao.model.FbTeacherDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FbTeacherDOMapper {
    long countByExample(FbTeacherDOExample example);

    int deleteByExample(FbTeacherDOExample example);

    int deleteByPrimaryKey(Integer teacherId);

    int insert(FbTeacherDO record);

    int insertSelective(FbTeacherDO record);

    List<FbTeacherDO> selectByExample(FbTeacherDOExample example);

    FbTeacherDO selectByPrimaryKey(@Param("teacherId") Integer teacherId, @Param("resultColumns") Object resultColumns);

    int updateByExampleSelective(@Param("record") FbTeacherDO record, @Param("example") FbTeacherDOExample example);

    int updateByExample(@Param("record") FbTeacherDO record, @Param("example") FbTeacherDOExample example);

    int updateByPrimaryKeySelective(FbTeacherDO record);

    int updateByPrimaryKey(FbTeacherDO record);
}
package com.xt.feedback.dao.mapper;

import com.xt.feedback.dao.model.FbResultDO;
import com.xt.feedback.dao.model.FbResultDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FbResultDOMapper {
    long countByExample(FbResultDOExample example);

    int deleteByExample(FbResultDOExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(FbResultDO record);

    int insertSelective(FbResultDO record);

    List<FbResultDO> selectByExample(FbResultDOExample example);

    FbResultDO selectByPrimaryKey(@Param("rId") Integer rId, @Param("resultColumns") Object resultColumns);

    int updateByExampleSelective(@Param("record") FbResultDO record, @Param("example") FbResultDOExample example);

    int updateByExample(@Param("record") FbResultDO record, @Param("example") FbResultDOExample example);

    int updateByPrimaryKeySelective(FbResultDO record);

    int updateByPrimaryKey(FbResultDO record);
}
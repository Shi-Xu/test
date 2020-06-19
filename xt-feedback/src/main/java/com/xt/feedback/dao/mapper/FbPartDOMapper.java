package com.xt.feedback.dao.mapper;

import com.xt.feedback.dao.model.FbPartDO;
import com.xt.feedback.dao.model.FbPartDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FbPartDOMapper {
    long countByExample(FbPartDOExample example);

    int deleteByExample(FbPartDOExample example);

    int deleteByPrimaryKey(Integer partId);

    int insert(FbPartDO record);

    int insertSelective(FbPartDO record);

    List<FbPartDO> selectByExample(FbPartDOExample example);

    FbPartDO selectByPrimaryKey(@Param("partId") Integer partId, @Param("resultColumns") Object resultColumns);

    int updateByExampleSelective(@Param("record") FbPartDO record, @Param("example") FbPartDOExample example);

    int updateByExample(@Param("record") FbPartDO record, @Param("example") FbPartDOExample example);

    int updateByPrimaryKeySelective(FbPartDO record);

    int updateByPrimaryKey(FbPartDO record);
}
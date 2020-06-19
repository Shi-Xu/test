package com.xt.feedback.dao.mapper;

import com.xt.feedback.dao.model.FbTchCustomDO;
import com.xt.feedback.dao.model.FbTchCustomDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FbTchCustomDOMapper {
    long countByExample(FbTchCustomDOExample example);

    int deleteByExample(FbTchCustomDOExample example);

    int deleteByPrimaryKey(Integer fbTchCustom);

    int insert(FbTchCustomDO record);

    int insertSelective(FbTchCustomDO record);

    List<FbTchCustomDO> selectByExample(FbTchCustomDOExample example);

    FbTchCustomDO selectByPrimaryKey(@Param("fbTchCustom") Integer fbTchCustom, @Param("resultColumns") Object resultColumns);

    int updateByExampleSelective(@Param("record") FbTchCustomDO record, @Param("example") FbTchCustomDOExample example);

    int updateByExample(@Param("record") FbTchCustomDO record, @Param("example") FbTchCustomDOExample example);

    int updateByPrimaryKeySelective(FbTchCustomDO record);

    int updateByPrimaryKey(FbTchCustomDO record);
}
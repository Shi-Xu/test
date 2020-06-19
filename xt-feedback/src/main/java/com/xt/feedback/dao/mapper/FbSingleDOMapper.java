package com.xt.feedback.dao.mapper;

import com.xt.feedback.dao.model.FbSingleDO;
import com.xt.feedback.dao.model.FbSingleDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FbSingleDOMapper {
    long countByExample(FbSingleDOExample example);

    int deleteByExample(FbSingleDOExample example);

    int deleteByPrimaryKey(Integer singleId);

    int insert(FbSingleDO record);

    int insertSelective(FbSingleDO record);

    List<FbSingleDO> selectByExample(FbSingleDOExample example);

    FbSingleDO selectByPrimaryKey(@Param("singleId") Integer singleId, @Param("resultColumns") Object resultColumns);

    int updateByExampleSelective(@Param("record") FbSingleDO record, @Param("example") FbSingleDOExample example);

    int updateByExample(@Param("record") FbSingleDO record, @Param("example") FbSingleDOExample example);

    int updateByPrimaryKeySelective(FbSingleDO record);

    int updateByPrimaryKey(FbSingleDO record);
}
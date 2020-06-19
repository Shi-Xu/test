package com.xt.feedback.dao.mapper;

import com.xt.feedback.dao.model.FbMultipleDO;
import com.xt.feedback.dao.model.FbMultipleDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FbMultipleDOMapper {
    long countByExample(FbMultipleDOExample example);

    int deleteByExample(FbMultipleDOExample example);

    int deleteByPrimaryKey(Integer multipleId);

    int insert(FbMultipleDO record);

    int insertSelective(FbMultipleDO record);

    List<FbMultipleDO> selectByExample(FbMultipleDOExample example);

    FbMultipleDO selectByPrimaryKey(@Param("multipleId") Integer multipleId, @Param("resultColumns") Object resultColumns);

    int updateByExampleSelective(@Param("record") FbMultipleDO record, @Param("example") FbMultipleDOExample example);

    int updateByExample(@Param("record") FbMultipleDO record, @Param("example") FbMultipleDOExample example);

    int updateByPrimaryKeySelective(FbMultipleDO record);

    int updateByPrimaryKey(FbMultipleDO record);
}
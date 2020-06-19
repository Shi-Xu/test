package com.xt.feedback.dao.mapper;

import com.xt.feedback.dao.model.FbQtypeDO;
import com.xt.feedback.dao.model.FbQtypeDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FbQtypeDOMapper {
    long countByExample(FbQtypeDOExample example);

    int deleteByExample(FbQtypeDOExample example);

    int deleteByPrimaryKey(Byte qtypeId);

    int insert(FbQtypeDO record);

    int insertSelective(FbQtypeDO record);

    List<FbQtypeDO> selectByExample(FbQtypeDOExample example);

    FbQtypeDO selectByPrimaryKey(@Param("qtypeId") Byte qtypeId, @Param("resultColumns") Object resultColumns);

    int updateByExampleSelective(@Param("record") FbQtypeDO record, @Param("example") FbQtypeDOExample example);

    int updateByExample(@Param("record") FbQtypeDO record, @Param("example") FbQtypeDOExample example);

    int updateByPrimaryKeySelective(FbQtypeDO record);

    int updateByPrimaryKey(FbQtypeDO record);
}
package com.xt.feedback.dao.mapper;

import com.xt.feedback.dao.model.FbTchUserDO;
import com.xt.feedback.dao.model.FbTchUserDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FbTchUserDOMapper {
    long countByExample(FbTchUserDOExample example);

    int deleteByExample(FbTchUserDOExample example);

    int deleteByPrimaryKey(Integer tchUserId);

    int insert(FbTchUserDO record);

    int insertSelective(FbTchUserDO record);

    List<FbTchUserDO> selectByExample(FbTchUserDOExample example);

    FbTchUserDO selectByPrimaryKey(@Param("tchUserId") Integer tchUserId, @Param("resultColumns") Object resultColumns);

    int updateByExampleSelective(@Param("record") FbTchUserDO record, @Param("example") FbTchUserDOExample example);

    int updateByExample(@Param("record") FbTchUserDO record, @Param("example") FbTchUserDOExample example);

    int updateByPrimaryKeySelective(FbTchUserDO record);

    int updateByPrimaryKey(FbTchUserDO record);
}
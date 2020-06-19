package com.xt.feedback.dao.mapper;

import com.xt.feedback.dao.model.FbQuestionnaireDO;
import com.xt.feedback.dao.model.FbQuestionnaireDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FbQuestionnaireDOMapper {
    long countByExample(FbQuestionnaireDOExample example);

    int deleteByExample(FbQuestionnaireDOExample example);

    int deleteByPrimaryKey(Integer questionnaireId);

    int insert(FbQuestionnaireDO record);

    int insertSelective(FbQuestionnaireDO record);

    List<FbQuestionnaireDO> selectByExample(FbQuestionnaireDOExample example);

    FbQuestionnaireDO selectByPrimaryKey(@Param("questionnaireId") Integer questionnaireId, @Param("resultColumns") Object resultColumns);

    int updateByExampleSelective(@Param("record") FbQuestionnaireDO record, @Param("example") FbQuestionnaireDOExample example);

    int updateByExample(@Param("record") FbQuestionnaireDO record, @Param("example") FbQuestionnaireDOExample example);

    int updateByPrimaryKeySelective(FbQuestionnaireDO record);

    int updateByPrimaryKey(FbQuestionnaireDO record);
}
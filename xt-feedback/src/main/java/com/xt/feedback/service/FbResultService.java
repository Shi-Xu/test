package com.xt.feedback.service;

import java.util.List;

import com.xt.feedback.common.base.BaseService;
import com.xt.feedback.dao.dto.FbMultipleDTO;
import com.xt.feedback.dao.dto.FbQuestionnaireDTO;
import com.xt.feedback.dao.dto.FbResultDTO;
import com.xt.feedback.dao.model.FbResultDO;
import com.xt.feedback.dao.model.FbResultDOExample;
import com.xt.feedback.dao.vo.StatisticsChart1VO;

/**
* FbResultService接口
*
*/
public interface FbResultService extends BaseService<FbResultDO, FbResultDOExample> {
	
	 public List<FbResultDTO> ListResultDTOs(int TchQuId);
	 
	/**
	 * 获取问卷及问卷固定题目答案统计结果
	 * @param quesionnaDto 问卷对象
	 * @param TchQuId 教学问卷关联ID
	 * @return
	 */
	FbQuestionnaireDTO getFbQuestionnaireDTOAndResult(FbQuestionnaireDTO quesionnaDto, int TchQuId);

	/**
	 * @param questionnaireDTO 必须包含统计结果
	 * @return
	 */
	StatisticsChart1VO getStatisticsChart1VOFull(FbQuestionnaireDTO questionnaireDTO);

	/**
	 * @param questionnaireDTO 必须包含统计结果
	 * @return
	 */
	StatisticsChart1VO getStatisticsChart1VOForAgree(FbQuestionnaireDTO questionnaireDTO);

	/**
	 * @param multipleDTOs
	 * @return
	 */
	StatisticsChart1VO getStatisticsChart1VOForMultiple(FbMultipleDTO multipleDTOs);

	/**
	 * @param questionnaireDTO
	 * @return
	 */
	List<StatisticsChart1VO> getListStatisticsChart1VOForMultiple(FbQuestionnaireDTO questionnaireDTO);

}
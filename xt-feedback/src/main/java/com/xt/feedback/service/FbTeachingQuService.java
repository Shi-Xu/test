package com.xt.feedback.service;

import com.xt.feedback.common.base.BaseService;
import com.xt.feedback.dao.dto.FbTeachingQuDTO;
import com.xt.feedback.dao.model.FbTeachingQuDO;
import com.xt.feedback.dao.model.FbTeachingQuDOExample;

/**
* FbTeachingQuService接口
*
*/
public interface FbTeachingQuService extends BaseService<FbTeachingQuDO, FbTeachingQuDOExample> {
	
	/**
	 * @param teachingId
	 * @param active 问卷是否激活
	 * @return
	 */
	FbTeachingQuDTO getTchQuAndQuestionnaire(int teachingId, Byte active);

	FbTeachingQuDTO getTchQuFull(int teachingId, Byte active);

}
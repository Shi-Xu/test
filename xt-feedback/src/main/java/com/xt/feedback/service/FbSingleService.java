package com.xt.feedback.service;

import java.util.List;

import com.xt.feedback.common.base.BaseService;
import com.xt.feedback.dao.dto.FbSingleDTO;
import com.xt.feedback.dao.model.FbSingleDO;
import com.xt.feedback.dao.model.FbSingleDOExample;

/**
* FbSingleService接口
*
*/
public interface FbSingleService extends BaseService<FbSingleDO, FbSingleDOExample> {

	List<FbSingleDTO> listFbSingleDOsByOrder(int partId);

	/*void insertSingle(int teachingId);*/

}
package com.xt.feedback.service;

import java.util.List;

import com.xt.feedback.common.base.BaseService;
import com.xt.feedback.dao.dto.FbMultipleDTO;
import com.xt.feedback.dao.model.FbMultipleDO;
import com.xt.feedback.dao.model.FbMultipleDOExample;

/**
* FbMultipleService接口
*
*/
public interface FbMultipleService extends BaseService<FbMultipleDO, FbMultipleDOExample> {

	List<FbMultipleDTO> listFbMultipleDOsByOrder(int partId);

	/*void insertFbMultiple(int teachingId);*/
}
package com.xt.feedback.service;

import java.util.List;

import com.xt.feedback.common.base.BaseService;
import com.xt.feedback.dao.model.FbPartDO;
import com.xt.feedback.dao.model.FbPartDOExample;

/**
* FbPartService接口
* Created by liteng on 2019/12/4.
*/
public interface FbPartService extends BaseService<FbPartDO, FbPartDOExample> {

	List<FbPartDO> listFbPartDOsByOrder(int questionnaireId);

}
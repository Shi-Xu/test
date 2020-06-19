package com.xt.feedback.service;

import com.xt.feedback.common.base.BaseService;
import com.xt.feedback.common.constant.FbResult;
import com.xt.feedback.dao.model.FbTchUserDO;
import com.xt.feedback.dao.model.FbTchUserDOExample;

/**
* FbTchUserService接口
*
*/
public interface FbTchUserService extends BaseService<FbTchUserDO, FbTchUserDOExample> {
	public FbResult login(String uname, String passWord, String ip);

	public FbResult resetPWD(String uname, String oldPassword, String newPassword);
}
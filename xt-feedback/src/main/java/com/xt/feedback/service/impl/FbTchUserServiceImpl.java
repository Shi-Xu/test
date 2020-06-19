package com.xt.feedback.service.impl;

import com.xt.feedback.common.annotation.BaseService;
import com.xt.feedback.common.base.BaseServiceImpl;
import com.xt.feedback.common.constant.FbResult;
import com.xt.feedback.common.constant.FbResultConstant;
import com.xt.feedback.dao.mapper.FbTchUserDOMapper;
import com.xt.feedback.dao.model.FbTchUserDO;
import com.xt.feedback.dao.model.FbTchUserDOExample;
import com.xt.feedback.dao.model.FbTeacherDO;
import com.xt.feedback.dao.model.FbTeacherDOExample;
import com.xt.feedback.service.FbTchUserService;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FbTchUserService实现
*
*/
@Service
@Transactional
@BaseService
public class FbTchUserServiceImpl extends BaseServiceImpl<FbTchUserDOMapper, FbTchUserDO, FbTchUserDOExample> implements FbTchUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FbTchUserServiceImpl.class);

    @Autowired
    FbTchUserDOMapper fbTchUserDOMapper;

	@Override
	public FbResult login(String uname, String passWord, String ip) {
		FbResult result;
		FbTchUserDOExample example =new FbTchUserDOExample();
		example.createCriteria().andUnameEqualTo(uname);
		FbTchUserDO tchUserDO = selectFirstByExample(example);
		if (tchUserDO.getUname()==null){
			result = new FbResult(FbResultConstant.FAILED,null,"系统中不存在该用户");
			return result;
		}
		if (!tchUserDO.getPasswd().equals(passWord)){
			result = new FbResult(FbResultConstant.FAILED,null,"密码错误");
			return result;
		}
		FbTchUserDO newTchUserDo = new FbTchUserDO();
		newTchUserDo.setTchUserId(tchUserDO.getTchUserId());
		tchUserDO.setLastIp(ip);
		newTchUserDo.setLastTime(new Date());
		updateByPrimaryKeySelective(newTchUserDo);
		result = new FbResult(FbResultConstant.SUCCESS,tchUserDO);
		return result;
	}

	@Override
	public FbResult resetPWD(String uname, String oldPassword, String newPassword) {
		FbResult result;
		FbTchUserDOExample example=new FbTchUserDOExample();
		example.createCriteria().andUnameEqualTo(uname);
		FbTchUserDO tchUserDO = selectFirstByExample(example);
		if (tchUserDO==null) {
			result=new FbResult(FbResultConstant.FAILED, null,"系统中不存在此教师用户");
			return result;
		}
		if (!tchUserDO.getPasswd().equals(oldPassword)) {
			result=new FbResult(FbResultConstant.FAILED, null,"密码错误");
			return result;
		}
		//修改密码
		FbTchUserDO newTchUserDO=new FbTchUserDO();
		newTchUserDO.setTchUserId(tchUserDO.getTchUserId());
		newTchUserDO.setPasswd(newPassword);
		updateByPrimaryKeySelective(newTchUserDO);
		result=new FbResult(FbResultConstant.SUCCESS, null,"修改密码成功，请重新登录");
		return result;
	}

}
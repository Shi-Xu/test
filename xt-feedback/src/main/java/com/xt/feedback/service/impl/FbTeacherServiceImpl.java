package com.xt.feedback.service.impl;

import com.xt.feedback.common.annotation.BaseService;
import com.xt.feedback.common.base.BaseServiceImpl;
import com.xt.feedback.common.constant.FbResult;
import com.xt.feedback.common.constant.FbResultConstant;
import com.xt.feedback.dao.mapper.FbTeacherDOMapper;
import com.xt.feedback.dao.model.FbTeacherDO;
import com.xt.feedback.dao.model.FbTeacherDOExample;
import com.xt.feedback.service.FbTeacherService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FbTeacherService实现
*
*/
@Service
@Transactional
@BaseService
public class FbTeacherServiceImpl extends BaseServiceImpl<FbTeacherDOMapper, FbTeacherDO, FbTeacherDOExample> implements FbTeacherService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FbTeacherServiceImpl.class);
    


}
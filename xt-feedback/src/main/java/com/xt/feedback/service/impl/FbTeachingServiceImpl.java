package com.xt.feedback.service.impl;

import com.xt.feedback.common.annotation.BaseService;
import com.xt.feedback.common.base.BaseServiceImpl;
import com.xt.feedback.common.constant.FbResult;
import com.xt.feedback.dao.dto.FbTeachingDTO;
import com.xt.feedback.dao.dto.FbTeachingQuDTO;
import com.xt.feedback.dao.mapper.FbTeachingDOMapper;
import com.xt.feedback.dao.mapper.FbTeachingQuDOMapper;
import com.xt.feedback.dao.model.FbTeacherDOExample;
import com.xt.feedback.dao.model.FbTeachingDO;
import com.xt.feedback.dao.model.FbTeachingDOExample;
import com.xt.feedback.dao.model.FbTeachingQuDO;
import com.xt.feedback.dao.model.FbTeachingQuDOExample;
import com.xt.feedback.service.FbTeachingQuService;
import com.xt.feedback.service.FbTeachingService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FbTeachingService实现
*
*/
@Service
@Transactional
@BaseService
public class FbTeachingServiceImpl extends BaseServiceImpl<FbTeachingDOMapper, FbTeachingDO, FbTeachingDOExample> implements FbTeachingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FbTeachingServiceImpl.class);

    @Autowired
    FbTeachingDOMapper fbTeachingDOMapper;
    @Autowired
    FbTeachingQuService teachingQuService;
    

    



    
}
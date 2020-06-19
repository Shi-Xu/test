package com.xt.feedback.service.impl;

import com.xt.feedback.common.annotation.BaseService;
import com.xt.feedback.common.base.BaseServiceImpl;
import com.xt.feedback.dao.mapper.FbTchCustomDOMapper;
import com.xt.feedback.dao.model.FbTchCustomDO;
import com.xt.feedback.dao.model.FbTchCustomDOExample;
import com.xt.feedback.service.FbTchCustomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FbTchCustomService实现
*
*/
@Service
@Transactional
@BaseService
public class FbTchCustomServiceImpl extends BaseServiceImpl<FbTchCustomDOMapper, FbTchCustomDO, FbTchCustomDOExample> implements FbTchCustomService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FbTchCustomServiceImpl.class);

    @Autowired
    FbTchCustomDOMapper fbTchCustomDOMapper;

}
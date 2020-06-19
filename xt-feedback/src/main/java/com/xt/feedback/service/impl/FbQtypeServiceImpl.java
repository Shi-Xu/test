package com.xt.feedback.service.impl;

import com.xt.feedback.common.annotation.BaseService;
import com.xt.feedback.common.base.BaseServiceImpl;
import com.xt.feedback.dao.mapper.FbQtypeDOMapper;
import com.xt.feedback.dao.model.FbQtypeDO;
import com.xt.feedback.dao.model.FbQtypeDOExample;
import com.xt.feedback.service.FbQtypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FbQtypeService实现
*
*/
@Service
@Transactional
@BaseService
public class FbQtypeServiceImpl extends BaseServiceImpl<FbQtypeDOMapper, FbQtypeDO, FbQtypeDOExample> implements FbQtypeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FbQtypeServiceImpl.class);

    @Autowired
    FbQtypeDOMapper fbQtypeDOMapper;

}
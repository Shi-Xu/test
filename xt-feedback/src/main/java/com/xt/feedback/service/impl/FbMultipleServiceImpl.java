package com.xt.feedback.service.impl;

import com.xt.feedback.common.annotation.BaseService;
import com.xt.feedback.common.base.BaseServiceImpl;
import com.xt.feedback.common.util.BeanUtil;
import com.xt.feedback.common.util.DateUtil;
import com.xt.feedback.common.util.JacksonUtil;
import com.xt.feedback.dao.dto.FbContentFromJsonDTO;
import com.xt.feedback.dao.dto.FbMultipleDTO;
import com.xt.feedback.dao.dto.FbSingleDTO;
import com.xt.feedback.dao.mapper.FbMultipleDOMapper;
import com.xt.feedback.dao.model.FbMultipleDO;
import com.xt.feedback.dao.model.FbMultipleDOExample;
import com.xt.feedback.service.FbMultipleService;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FbMultipleService实现
*
*/
@Service
@Transactional
@BaseService

public class FbMultipleServiceImpl extends BaseServiceImpl<FbMultipleDOMapper, FbMultipleDO, FbMultipleDOExample> implements FbMultipleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FbMultipleServiceImpl.class);

    @Autowired
    FbMultipleDOMapper multipleDOMapper;


	public List<FbMultipleDTO> listFbMultipleDOsByOrder(int partId) {
		FbMultipleDOExample example=new FbMultipleDOExample();
		example.createCriteria().andPartIdEqualTo(partId);
		example.setOrderByClause("sort asc");
		List<FbMultipleDO> multipleDOs=selectByExample(example);
		List<FbMultipleDTO> multipleDTOs= BeanUtil.copyList(multipleDOs, FbMultipleDTO.class);
		//解析content
		for (FbMultipleDTO fbMultipleDTO : multipleDTOs) {
			String contentString=fbMultipleDTO.getContent();
			FbContentFromJsonDTO contentFromJsonDTOs=JacksonUtil.json2Pojo(contentString, FbContentFromJsonDTO.class);
			fbMultipleDTO.setContentFromJsonDTO(contentFromJsonDTOs);
		}
		return multipleDTOs;
	}

/*	@Override
	public void insertFbMultiple(int teachingId) {
		FbMultipleDOExample example = new FbMultipleDOExample();
		FbMultipleDO fbMultipleDO = new FbMultipleDO();
		fbMultipleDO.setUuid(UUID.randomUUID().toString());
		fbMultipleDO.setCtime(System.currentTimeMillis());
		fbMultipleDO.setPartId(2);
		fbMultipleDO.setTeachingId((long) teachingId);
		fbMultipleDO.setQtype((byte) 2);
		FbMultipleDOExample.Criteria criteria = example.createCriteria();
		int i = insertSelective(fbMultipleDO);
	}*/
}
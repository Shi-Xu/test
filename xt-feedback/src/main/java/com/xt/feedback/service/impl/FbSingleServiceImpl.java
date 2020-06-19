package com.xt.feedback.service.impl;

import com.xt.feedback.common.annotation.BaseService;
import com.xt.feedback.common.base.BaseServiceImpl;
import com.xt.feedback.common.util.BeanUtil;
import com.xt.feedback.common.util.JacksonUtil;
import com.xt.feedback.dao.dto.FbContentFromJsonDTO;
import com.xt.feedback.dao.dto.FbOptionDTO;
import com.xt.feedback.dao.dto.FbSingleDTO;
import com.xt.feedback.dao.mapper.FbSingleDOMapper;
import com.xt.feedback.dao.model.FbMultipleDO;
import com.xt.feedback.dao.model.FbMultipleDOExample;
import com.xt.feedback.dao.model.FbSingleDO;
import com.xt.feedback.dao.model.FbSingleDOExample;
import com.xt.feedback.service.FbSingleService;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FbSingleDOService实现
*
*/
@Service
@Transactional
@BaseService
public class FbSingleServiceImpl extends BaseServiceImpl<FbSingleDOMapper, FbSingleDO, FbSingleDOExample> implements FbSingleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FbSingleServiceImpl.class);


	@Override
	public List<FbSingleDTO> listFbSingleDOsByOrder(int partId) {
		FbSingleDOExample example=new FbSingleDOExample();
		example.createCriteria().andPartIdEqualTo(partId);
		example.setOrderByClause("sort asc");
		List<FbSingleDO> singleDOs=selectByExample(example);
		List<FbSingleDTO> singleDTOs= BeanUtil.copyList(singleDOs, FbSingleDTO.class);
		//解析content
		for (FbSingleDTO fbSingleDTO : singleDTOs) {
			String contentString=fbSingleDTO.getContent();
			FbContentFromJsonDTO contentFromJsonDTOs=JacksonUtil.json2Pojo(contentString, FbContentFromJsonDTO.class);
			fbSingleDTO.setContentFromJsonDTO(contentFromJsonDTOs);
		}
		return singleDTOs;
	}

	/*@Override
	public void insertSingle(int teachingId) {
		FbSingleDO fbSingleDO = new FbSingleDO();
		fbSingleDO.setUuid(UUID.randomUUID().toString());
		fbSingleDO.setCtime(System.currentTimeMillis());
		fbSingleDO.setPartId(2);
		fbSingleDO.setTeachingId((long) teachingId);
		fbSingleDO.setQtype((byte) 2);
		int i = insertSelective(fbSingleDO);
	}*/

}
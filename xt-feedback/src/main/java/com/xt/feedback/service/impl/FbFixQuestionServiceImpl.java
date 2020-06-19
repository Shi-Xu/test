package com.xt.feedback.service.impl;

import java.util.List;

import org.apache.commons.collections.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xt.feedback.dao.dto.FbFixQuestionDTO;
import com.xt.feedback.dao.dto.FbMultipleDTO;
import com.xt.feedback.dao.dto.FbSingleDTO;
import com.xt.feedback.service.FbFixQuestionService;
import com.xt.feedback.service.FbMultipleService;
import com.xt.feedback.service.FbSingleService;

@Service
@Transactional
public class FbFixQuestionServiceImpl implements FbFixQuestionService {

	@Autowired
	FbSingleService singleService;
	@Autowired
	FbMultipleService multipleService;

	@Override
	public List<FbFixQuestionDTO> listFbFixQuestionDTOsByOrder(int partId) {
		List<FbSingleDTO> singleDOs = singleService.listFbSingleDOsByOrder(partId);
		List<FbMultipleDTO> multiples = multipleService.listFbMultipleDOsByOrder(partId);
		List<FbFixQuestionDTO> fixQuestionDTOs = ListUtils.union(singleDOs, multiples);
		return fixQuestionDTOs;
	}

}

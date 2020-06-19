package com.xt.feedback.service.impl;

import com.xt.feedback.common.annotation.BaseService;
import com.xt.feedback.common.base.BaseServiceImpl;
import com.xt.feedback.common.base.FbQtype;
import com.xt.feedback.common.util.BeanUtil;
import com.xt.feedback.common.util.JacksonUtil;
import com.xt.feedback.common.util.ViewUtil;
import com.xt.feedback.dao.dto.FbContentFromJsonDTO;
import com.xt.feedback.dao.dto.FbFixQuestionDTO;
import com.xt.feedback.dao.dto.FbFixResultFromJsonDTO;
import com.xt.feedback.dao.dto.FbFixResultFromJsonDTO.FbResultItemDTO;
import com.xt.feedback.dao.dto.FbMultipleDTO;
import com.xt.feedback.dao.dto.FbOptionDTO;
import com.xt.feedback.dao.dto.FbPartDTO;
import com.xt.feedback.dao.dto.FbQuestionnaireDTO;
import com.xt.feedback.dao.dto.FbResultDTO;
import com.xt.feedback.dao.dto.FbSingleDTO;
import com.xt.feedback.dao.mapper.FbResultDOMapper;
import com.xt.feedback.dao.model.FbResultDO;
import com.xt.feedback.dao.model.FbResultDOExample;
import com.xt.feedback.dao.vo.StatisticsChart1VO;
import com.xt.feedback.dao.vo.StatisticsChart1VO.DataSet;
import com.xt.feedback.service.FbQuestionnaireService;
import com.xt.feedback.service.FbResultService;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

import javax.swing.text.View;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * FbResultService实现 Created by liteng on 2019/12/4.
 */
@Service
@Transactional
@BaseService
public class FbResultServiceImpl extends BaseServiceImpl<FbResultDOMapper, FbResultDO, FbResultDOExample>
		implements FbResultService {

	private static final Logger LOGGER = LoggerFactory.getLogger(FbResultServiceImpl.class);

	@Autowired
	FbResultDOMapper fbResultDOMapper;
	@Autowired
	FbQuestionnaireService questionnaireService;

	public List<FbResultDTO> ListResultDTOs(int TchQuId) {
		FbResultDOExample example = new FbResultDOExample();
		example.createCriteria().andTchQuIdEqualTo(TchQuId);
		List<FbResultDO> resultDOs = selectByExample(example);
		List<FbResultDTO> resultDTOs = BeanUtil.copyList(resultDOs, FbResultDTO.class);
		// 解析FixResult字段
		for (FbResultDTO fbResultDTO : resultDTOs) {
			String fixString = fbResultDTO.getFixResult();
			List<FbResultItemDTO> resultItemDTOs = JacksonUtil.jsonArray2PojoList(fixString, FbResultItemDTO.class);
			FbFixResultFromJsonDTO fixResultFromJsonDTO = new FbFixResultFromJsonDTO(resultItemDTOs);
			fbResultDTO.setFixResultFromJsonDTO(fixResultFromJsonDTO);
		}
		return resultDTOs;
	}

	@Override
	public FbQuestionnaireDTO getFbQuestionnaireDTOAndResult(FbQuestionnaireDTO quesionnaDto, int TchQuId) {
		// 获取答案
		List<FbResultDTO> resultDTOs = ListResultDTOs(TchQuId);
		quesionnaDto.setResultTotal(resultDTOs.size());
		// 问卷封装答案
		List<FbPartDTO> fbPartDTOs = quesionnaDto.getParts();
		for (FbPartDTO fbPartDTO : fbPartDTOs) {
			List<FbFixQuestionDTO> fixQuestionDTOs = fbPartDTO.getFixQuestionDTOs();
			for (FbResultDTO fbResultDTO : resultDTOs) {
				matchOption(fixQuestionDTOs, fbResultDTO.getFixResultFromJsonDTO().getResultItemDTOs());
			}

		}
		return quesionnaDto;

	}

	@Override
	public StatisticsChart1VO getStatisticsChart1VOFull(FbQuestionnaireDTO questionnaireDTO) {
		// 获取所有题目
		List<FbSingleDTO> fbSingleDTOs = questionnaireService.getlistFbSingleDTO(questionnaireDTO);
		// 创建VO对象，初始化datasets
		String[] options = { "非常认同", "比较认同", "一般认同", "基本不认同", "非常不认同" };
		StatisticsChart1VO chart1VO = new StatisticsChart1VO(options, fbSingleDTOs.size());
		String[] labels=chart1VO.getLabels();
		List<DataSet> datasets = chart1VO.getDatasets();
		// 遍历题目
		for (int i = 0; i < fbSingleDTOs.size(); i++) {
			FbSingleDTO fbSingleDTO = fbSingleDTOs.get(i);
			labels[i]="必选"+fbSingleDTO.getSort();
			List<FbOptionDTO> optionDTOs = fbSingleDTO.getContentFromJsonDTO().getOptionDTOs();
			// 遍历选项
			for (int j = 0; j < options.length; j++) {
				FbOptionDTO optionDTO = optionDTOs.get(j);
				int total = optionDTO.getTotal();
				DataSet dataSet = datasets.get(j);
				int[] data = dataSet.getData();
				data[i] = total;
			}
		}
		return chart1VO;
	}

	@Override
	public StatisticsChart1VO getStatisticsChart1VOForAgree(FbQuestionnaireDTO questionnaireDTO) {
		// 获取所有题目
		List<FbSingleDTO> fbSingleDTOs = questionnaireService.getlistFbSingleDTO(questionnaireDTO);
		// 创建VO对象，初始化datasets
		String[] options = { "非常认同", "比较认同", "一般认同" };
		StatisticsChart1VO chart1VO = new StatisticsChart1VO(options, fbSingleDTOs.size());
		String[] labels=chart1VO.getLabels();
		List<DataSet> datasets = chart1VO.getDatasets();
		// 遍历题目
		for (int i = 0; i < fbSingleDTOs.size(); i++) {
			FbSingleDTO fbSingleDTO = fbSingleDTOs.get(i);
			labels[i]="必选"+fbSingleDTO.getSort();
			List<FbOptionDTO> optionDTOs = fbSingleDTO.getContentFromJsonDTO().getOptionDTOs();
			// 遍历选项
			for (int j = 0; j < options.length; j++) {
				FbOptionDTO optionDTO = optionDTOs.get(j);
				int total = optionDTO.getTotal();
				DataSet dataSet = datasets.get(j);
				int[] data = dataSet.getData();
				data[i] = total;
			}
		}
		return chart1VO;
	}

	@Override
	public StatisticsChart1VO getStatisticsChart1VOForMultiple(FbMultipleDTO multipleDTOs) {
		List<FbOptionDTO> optionDTOs = multipleDTOs.getContentFromJsonDTO().getOptionDTOs();
		StatisticsChart1VO chart1VO=new StatisticsChart1VO(optionDTOs.size());
		String[] labels = chart1VO.getLabels();
		DataSet dataSet = chart1VO.getDatasets().get(0);
		// 遍历选项
		for (int j = 0; j < optionDTOs.size(); j++) {
			FbOptionDTO optionDTO = optionDTOs.get(j);
			int total = optionDTO.getTotal();
			labels[j]=ViewUtil.numberToLetter(multipleDTOs.getSort())+optionDTO.getItem();
			int[] data = dataSet.getData();
			data[j] = total;
		}
		return chart1VO;
	}
	
	@Override
	public List<StatisticsChart1VO> getListStatisticsChart1VOForMultiple(FbQuestionnaireDTO questionnaireDTO) {
		List<StatisticsChart1VO> statisticsChart1VOs=new ArrayList<>();
		List<FbMultipleDTO> getlistFbMultipleDTO = questionnaireService.getlistFbMultipleDTO(questionnaireDTO);
		for (FbMultipleDTO fbMultipleDTO : getlistFbMultipleDTO) {
			StatisticsChart1VO statisticsChart1VO = getStatisticsChart1VOForMultiple(fbMultipleDTO);
			statisticsChart1VOs.add(statisticsChart1VO);
		}
		return statisticsChart1VOs;
	}
	
	/**
	 * 统计固定选项题目中各个选项的选择数量
	 * 
	 * @param fixQuestionDTOs 题目列表
	 * @param resultItemDTOs  题目答案列表
	 */
	private void matchOption(List<FbFixQuestionDTO> fixQuestionDTOs, List<FbResultItemDTO> resultItemDTOs) {
		for (FbResultItemDTO fbResultItemDTO : resultItemDTOs) {
			for (FbFixQuestionDTO fixQuestionDTO : fixQuestionDTOs) {
				if (fbResultItemDTO.getUuid().equals(fixQuestionDTO.getUuid())) {
					FbContentFromJsonDTO contentFromJsonDTO = fixQuestionDTO.getContentFromJsonDTO();
					if (fixQuestionDTO.getQtype().equals(FbQtype.SINGLE.getQtypeId())) {
						// 单选题答案解析
						String questionResult = fbResultItemDTO.getResult();
						contentFromJsonDTO.matchResult(questionResult);
					}
					if (fixQuestionDTO.getQtype().equals(FbQtype.MULTIPLE.getQtypeId())) {
						// 多选题答案解析
						String result = fbResultItemDTO.getResult();
						String[] resultArray = result.split(",");
						for (int i = 0; i < resultArray.length; i++) {
							contentFromJsonDTO.matchResult(resultArray[i]);
						}
					}
				}
			}
		}
	}

}
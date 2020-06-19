package com.xt.feedback.dao.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 封装题目：题干+选项列表
 */
public class FbContentFromJsonDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("stem")
	private String stem;
	@JsonProperty("options")
	private List<FbOptionDTO> optionDTOs = new ArrayList<>();
	
	public String getStem() {
		return stem;
	}

	public void setStem(String stem) {
		this.stem = stem;
	}

	public List<FbOptionDTO> getOptionDTOs() {
		return optionDTOs;
	}

	public void setOptionDTOs(List<FbOptionDTO> optionDTOs) {
		this.optionDTOs = optionDTOs;
	}
	
	/**
	 * @param questionResult
	 * 根据答案，统计题目选项的total
	 */
	public void matchResult(String questionResult) {
		for (FbOptionDTO optionDTO : optionDTOs) {
			if (optionDTO.getItem().equals(questionResult)) {
				int total=optionDTO.getTotal();
				optionDTO.setTotal(total+1);
			}
		}
	}
	
}

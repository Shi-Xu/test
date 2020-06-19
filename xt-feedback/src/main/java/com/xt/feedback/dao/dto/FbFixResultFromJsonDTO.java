package com.xt.feedback.dao.dto;

import java.io.Serializable;
import java.util.List;

public class FbFixResultFromJsonDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	List<FbResultItemDTO> resultItemDTOs;
	
	public FbFixResultFromJsonDTO() {
		super();
	}
	
	public FbFixResultFromJsonDTO(List<FbResultItemDTO> resultItemDTOs) {
		setResultItemDTOs(resultItemDTOs);
	}
	
	public List<FbResultItemDTO> getResultItemDTOs() {
		return resultItemDTOs;
	}

	public void setResultItemDTOs(List<FbResultItemDTO> resultItemDTOs) {
		this.resultItemDTOs = resultItemDTOs;
	}



	public static class FbResultItemDTO implements Serializable{
		
		private static final long serialVersionUID = 1L;
		private String uuid;
		/**
		 * 题目答案
		 */
		private String result;
		public String getUuid() {
			return uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
	}
	
}

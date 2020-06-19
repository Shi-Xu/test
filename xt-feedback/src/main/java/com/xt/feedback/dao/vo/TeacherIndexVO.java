package com.xt.feedback.dao.vo;

import java.util.List;

import com.xt.feedback.dao.dto.FbMultipleDTO;
import com.xt.feedback.dao.dto.FbTeachingQuDTO;

public class TeacherIndexVO {
	private int total;
	private FbTeachingQuDTO teachingQuDTO;
	private StatisticsChart1VO singleChartForFull;
	private StatisticsChart1VO singleChartForAgree;
	private List<StatisticsChart1VO> multipleCharts;
	private List<FbMultipleDTO> multipleDTOs;
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public FbTeachingQuDTO getTeachingQuDTO() {
		return teachingQuDTO;
	}
	public void setTeachingQuDTO(FbTeachingQuDTO teachingQuDTO) {
		this.teachingQuDTO = teachingQuDTO;
	}
	public StatisticsChart1VO getSingleChartForFull() {
		return singleChartForFull;
	}
	public void setSingleChartForFull(StatisticsChart1VO singleChartForFull) {
		this.singleChartForFull = singleChartForFull;
	}
	public StatisticsChart1VO getSingleChartForAgree() {
		return singleChartForAgree;
	}
	public void setSingleChartForAgree(StatisticsChart1VO singleChartForAgree) {
		this.singleChartForAgree = singleChartForAgree;
	}
	public List<StatisticsChart1VO> getMultipleCharts() {
		return multipleCharts;
	}
	public void setMultipleCharts(List<StatisticsChart1VO> multipleCharts) {
		this.multipleCharts = multipleCharts;
	}
	public List<FbMultipleDTO> getMultipleDTOs() {
		return multipleDTOs;
	}
	public void setMultipleDTOs(List<FbMultipleDTO> multipleDTOs) {
		this.multipleDTOs = multipleDTOs;
	}
	

	
}

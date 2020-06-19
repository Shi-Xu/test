package com.xt.feedback.dao.vo;

import java.util.ArrayList;
import java.util.List;

import io.swagger.models.properties.StringProperty;

/**
 *
 * data:{
        labels: ['必选1', '必选2', '必选3', '必选4', '必选5', '必选6', '必选7', '必选8', '必选9', '必选10'],
        datasets: [{
			label: '非常认同',
			data: [40,32,50,46,36,54,23,86,20,58],
			backgroundColor: "rgba(59, 89, 152, 0.25)",
			borderColor: "#3b5998",
			borderWidth: 2,
		}
 */
public class StatisticsChart1VO {
	//必选题清单
	private String[] labels;
	//数据
	private List<DataSet> datasets;
	
	/**
	 * 必选题VO
	 * @param
	 * @param singleTotal
	 */
	public StatisticsChart1VO(String[] options,int singleTotal) {
		datasets=new ArrayList<>();
		labels=new String[singleTotal];
		for (int i = 0; i < options.length; i++) {
			DataSet dataSet=new DataSet();
			dataSet.setLabel(options[i]);
			int[] data=new int[singleTotal];
			dataSet.setData(data);
			datasets.add(dataSet);
		}
	}
	
	/**
	 * 任选题VO
	 * @param optionTotal
	 */
	public StatisticsChart1VO(int optionTotal) {
		datasets=new ArrayList<>();
		labels=new String[optionTotal];
		DataSet dataSet=new DataSet();
		int[] data=new int[optionTotal];
		dataSet.setData(data);
		datasets.add(dataSet);
	}
	
	public String[] getLabels() {
		return labels;
	}


	public void setLabels(String[] labels) {
		this.labels = labels;
	}


	public List<DataSet> getDatasets() {
		return datasets;
	}

	public void setDatasets(List<DataSet> datasets) {
		this.datasets = datasets;
	}

	public static class DataSet{
		//选项
		private String label;
		//选项数据列表（所有题目）
		private int[] data;
		public String getLabel() {
			return label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public int[] getData() {
			return data;
		}
		public void setData(int[] data) {
			this.data = data;
		}
		
	}
	

}



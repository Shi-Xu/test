package com.xt.feedback.common.util;

import org.apache.commons.lang.StringUtils;

public class ViewUtil {
	/**
	 * @param year
	 * @return 分割开始学年[0]和结束学年[1]
	 */
	public static String[] splitYear(String year) {
		String startYear = null;
		String endYear = null;
		if (StringUtils.isNotEmpty(year)) {
			String[] strings=year.split("-");
			startYear=strings[0].trim();
			endYear=strings[1].trim().substring(0, 4);
		}
		return new String[] {startYear,endYear};
	}
	
	/**
	 * @param courseNo
	 * @return 分割课程号[0]和课程序号[1]
	 */
	public static String[] splitCourseNo(String courseNo) {
		String courseNo1 = null;
		String courseOrder = null;
		if (StringUtils.isNotEmpty(courseNo)) {
			String[] strings=courseNo.split("-");
			courseNo1=strings[0].trim();
			courseOrder=strings[1].trim();
		}
		return new String[] {courseNo1,courseOrder};
	}
	
	//数字转字母 1-26 ： A-Z
	public static String numberToLetter(int num) {
	    if (num <= 0) {
	        return null;
	    }
	    String letter = "";
	    num--;
	    do {
	        if (letter.length() > 0) {
	            num--;
	        }
	        letter = ((char) (num % 26 + (int) 'A')) + letter;
	        num = (int) ((num - num % 26) / 26);
	    } while (num > 0);

	    return letter;
	}
	
	//字母转数字  A-Z ：1-26
	public static int letterToNumber(String letter) {
	    int length = letter.length();
	    int num = 0;
	    int number = 0;
	    for(int i = 0; i < length; i++) {
	        char ch = letter.charAt(length - i - 1);
	        num = (int)(ch - 'A' + 1) ;
	        num *= Math.pow(26, i);
	        number += num;
	    }
	    return number;
	}
	
}

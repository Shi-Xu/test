package com.xt.feedback.common.util;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

public class DateUtil {

	public static Date parseDate(String startDate, String pattern) throws ParseException {
		String[] parsePatterns= {pattern};
		return DateUtils.parseDate(startDate, parsePatterns);
	}
	

}

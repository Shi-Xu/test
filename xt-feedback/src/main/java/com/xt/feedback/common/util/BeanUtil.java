package com.xt.feedback.common.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

public class BeanUtil {

	public static <T> T copy(Object poObj, final Class<T> destClass) {
		if (poObj == null) return null;
		T voObj = null;
		try {
			voObj = destClass.newInstance();
			BeanUtils.copyProperties(voObj, poObj);
			return voObj;
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static <T> List<T> copyList(List<? extends Object> poList, final Class<T> voClass) {
		if (poList == null) return null;

		List<T> voList = new ArrayList<T>();

		T voObj = null;
		for (Object poObj : poList) {
			try {
				voObj = voClass.newInstance();
				BeanUtils.copyProperties(voObj, poObj);
				voList.add(voObj);
			} catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return voList;
	}
}

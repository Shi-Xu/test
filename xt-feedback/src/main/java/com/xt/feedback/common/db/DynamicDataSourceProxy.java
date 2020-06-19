package com.xt.feedback.common.db;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;



@Aspect
@Order(1)
public class DynamicDataSourceProxy {

	@Before(value = "@annotation(com.xintong.common.db.DataSource)")
	public void before(JoinPoint jp) throws NoSuchMethodException, SecurityException {
		MethodSignature signature = (MethodSignature) jp.getSignature();
		Method method = signature.getMethod();
		Method realMethod = jp.getTarget().getClass().getDeclaredMethod(signature.getName(),
				method.getParameterTypes());
		DataSource ds = realMethod.getAnnotation(DataSource.class);
		//如果已经使用了MASTER，则不再切换为SLAVE
		if(DynamicDataSource.getDataSource()!=null&
				((String)DynamicDataSource.getDataSource()).equals(DataSourceEnum.MASTER.getName())){
			return;
		}
		DynamicDataSource.setDataSource(ds.value().getName());
	}
}

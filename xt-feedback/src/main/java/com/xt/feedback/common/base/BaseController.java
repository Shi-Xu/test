package com.xt.feedback.common.base;

import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.velocity.exception.TemplateInitException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.CleanupFailureDataAccessException;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DataRetrievalFailureException;
import org.springframework.dao.DeadlockLoserDataAccessException;
import org.springframework.dao.IncorrectUpdateSemanticsDataAccessException;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.dao.UncategorizedDataAccessException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.xt.feedback.common.util.PropertiesFileUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 控制器基类
 */
public abstract class BaseController {
	public static final String LIMITDEFAULT="25";
	private final static Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

	/**
	 * 统一异常处理
	 * 
	 * @param request
	 * @param response
	 * @param exception
	 */
	@ExceptionHandler
	public String exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {
		LOGGER.error("统一异常处理：", exception);
		request.setAttribute("ex", exception);
		if (null != request.getHeader("X-Requested-With")
				&& "XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With"))) {
			request.setAttribute("requestHeader", "ajax");
		}
		// shiro没有权限异常
		if (exception instanceof UnauthorizedException) {
			return "/pages-403.html";
		}
		if (exception instanceof TemplateInitException) {
			return "/pages-404.html";
		}
		// shiro会话已过期异常
		if (exception instanceof InvalidSessionException) {
			return "/pages-404.html";
		}
		if (exception instanceof HttpRequestMethodNotSupportedException) {
			return "/pages-404.html";
		}
		if (exception instanceof NullPointerException) {
			return "/pages-404.html";
		}
		if (exception instanceof ClassCastException) {
			return "/pages-404.html";
		}
		if (exception instanceof MissingServletRequestParameterException) {
			return "/pages-404.html";
		}

		// spring DAO异常处理
		if (exception instanceof DataAccessException) {
			
			if (exception instanceof CleanupFailureDataAccessException) {
				return "/pages-404.html";
			}
			if (exception instanceof DataAccessResourceFailureException) {
				return "/pages-404.html";
			}
			if (exception instanceof DataIntegrityViolationException) {
				return "/pages-404.html";
			}
			if (exception instanceof DataRetrievalFailureException) {
				return "/pages-404.html";
			}
			if (exception instanceof DeadlockLoserDataAccessException) {
				return "/pages-404.html";
			}
			if (exception instanceof IncorrectUpdateSemanticsDataAccessException) {
				return "/pages-404.html";
			}
			if (exception instanceof OptimisticLockingFailureException) {
				return "/pages-404.html";
			}
			if (exception instanceof UncategorizedDataAccessException) {
				return "/pages-404.html";
			}
		}
		return "/pages-404.html";
	}

	/**
	 * 返回jsp视图
	 * 
	 * @param path
	 * @return
	 */
	public static String jsp(String path) {
		return path.concat(".jsp");
		/*String folder = PropertiesFileUtil.getInstance().get("app.name");
		return "/".concat(folder).concat(path).concat(".jsp");*/
	}

	/**
	 * 返回thymeleaf视图
	 * 
	 * @param path
	 * @return
	 */
	public static String thymeleaf(String path) {
		String folder = PropertiesFileUtil.getInstance().get("app.name");
		return "/".concat(folder).concat(path).concat(".html");
	}

}

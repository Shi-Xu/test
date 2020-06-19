package com.xt.feedback.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.xt.feedback.common.constant.FbResult;
import com.xt.feedback.common.constant.FbResultConstant;
import com.xt.feedback.dao.dto.SessionDTO;

public class LoginInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		SessionDTO userSession = (SessionDTO)request.getSession().getAttribute("userSession");
        if (userSession == null) {
        	session.setAttribute("result", new FbResult(FbResultConstant.FAILED, null, "请重新登录"));
        	response.sendRedirect(request.getContextPath()+"/teacher/login");
            return false;
        }
        return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
}

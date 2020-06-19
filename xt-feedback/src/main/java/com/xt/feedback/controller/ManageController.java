package com.xt.feedback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xt.feedback.common.base.BaseController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@Api(value = "后台控制器")
public class ManageController extends BaseController{
	/**
	 * 后台首页
	 * @return
	 */
	@ApiOperation(value = "后台首页")
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index() {
		return "redirect:/choose";
	}
	
	@ApiOperation(value = "学生选课")
	@RequestMapping(value = "/choose", method = RequestMethod.GET)
	public String choose() {
		return "/front/index";
	}
	
	@ApiOperation(value = "成功页面")
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String success() {
		return "/front/success";
	}
	
	@ApiOperation(value = "教师管理首页")
	@RequestMapping(value = "/teacher/index", method = RequestMethod.GET)
	public String teacherIndex() {
		return "/teacher/teacher-index";
	}
	
	@ApiOperation(value = "教师登录页面")
	@RequestMapping(value = "/teacher/login", method = RequestMethod.GET)
	public String teacherLoginPage() {
		return "/teacher/authentication-login";
	}
	
	@ApiOperation(value = "教师登录页面")
	@RequestMapping(value = "/teacher/resetPWD", method = RequestMethod.GET)
	public String teacherresetPage() {
		return "/teacher/authentication-reset-password";
	}
	@ApiOperation(value = "查询课程页面")
	@RequestMapping(value = "/teacher/custom/query", method = RequestMethod.GET)
	public String teacherQuery() {
		return "/teacher/custom-query";
	}

}

package com.xt.feedback.controller.manager;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.xt.feedback.dao.dto.*;
import com.xt.feedback.dao.model.*;
import com.xt.feedback.service.*;
import com.xt.feedback.service.impl.FbSingleServiceImpl;
import io.swagger.models.auth.In;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.xt.feedback.common.base.BaseController;
import com.xt.feedback.common.constant.FbResult;
import com.xt.feedback.common.constant.FbResultConstant;
import com.xt.feedback.common.util.BeanUtil;
import com.xt.feedback.common.util.IpUtil;
import com.xt.feedback.common.util.ViewUtil;
import com.xt.feedback.dao.vo.TeacherIndexVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@ControllerAdvice
@Api(value = "学生选择课程")
@RequestMapping("/teacher")
public class TchController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TchController.class);

    @Resource
    private HttpServletRequest request;
    @Resource
    private HttpSession session;
    @Resource
    private FbTchUserService tchUserService;
    @Resource
    private FbMultipleService multipleService;
    @Resource
    private FbSingleService SingleService;
    @Resource
    private FbTeachingService teachingService;
    @Resource
    private FbTeacherService teacherService;
    @Resource
    private FbTeachingQuService teachingQuService;
    @Resource
    private FbQuestionnaireService questionnaireService;
    @Resource
    private FbResultService resultService;


    @ApiOperation("获取试卷统计结果")
    @RequestMapping(value = "/statistics/{teachingId}", method = RequestMethod.GET)
    public String findQuestionnaire(@PathVariable(value = "teachingId") int
                                            teachingId, ModelMap modelMap) {
        //获取教学试卷关联id
        FbTeachingQuDTO teachingQuDTO = teachingQuService.getTchQuFull(teachingId, null);
        if (teachingQuDTO == null) {
            modelMap.addAttribute("result", new FbResult(FbResultConstant.FAILED,
                    null, "问卷获取失败"));
            return "/teacher/statistics";
        }
        //获取试卷
        FbQuestionnaireDTO fbQuestionnaireDTO = teachingQuDTO.getQuestionnaireDTO();
        //获取统计信息
        fbQuestionnaireDTO = resultService.getFbQuestionnaireDTOAndResult(fbQuestionnaireDTO, teachingQuDTO.getTchQuId());
        teachingQuDTO.setQuestionnaireDTO(fbQuestionnaireDTO);
        TeacherIndexVO teacherIndexVO = new TeacherIndexVO();
        teacherIndexVO.setTotal(fbQuestionnaireDTO.getResultTotal());
        teacherIndexVO.setTeachingQuDTO(teachingQuDTO);
        teacherIndexVO.setSingleChartForFull(resultService.getStatisticsChart1VOFull(fbQuestionnaireDTO));
        teacherIndexVO.setSingleChartForAgree(resultService.getStatisticsChart1VOForAgree(fbQuestionnaireDTO));
        teacherIndexVO.setMultipleCharts(resultService.getListStatisticsChart1VOForMultiple(fbQuestionnaireDTO));
        modelMap.addAttribute("result", new FbResult(FbResultConstant.SUCCESS, teacherIndexVO));
        return "/teacher/statistics";
    }

    @ApiOperation("查询获取课程列表")
    @RequestMapping(value = "/query/teaching/list", method = RequestMethod.POST)
    @ResponseBody
    public FbResult findTeachingList(@RequestParam(required = true, value = "year") String year,
                                     @RequestParam(required = true, value = "term") Byte term,
                                     @RequestParam(required = true, value = "major") String major) {
        if (StringUtils.isEmpty(year) || StringUtils.isEmpty(major)) {
            return new FbResult(FbResultConstant.FAILED, null, "课程问卷查询失败");
        }
        //获取当前登录教师的姓名
        SessionDTO userSession = (SessionDTO) session.getAttribute("userSession");
        String tchname = userSession.getUname();
        FbTeachingDOExample example = new FbTeachingDOExample();
        FbTeachingDOExample.Criteria criteria = example.createCriteria();
        String[] strings = ViewUtil.splitYear(year);
        criteria.andStartYearEqualTo(strings[0]);
        criteria.andEndYearEqualTo(strings[1]);
        criteria.andTermEqualTo(term);
        criteria.andMajorLike("%" + major + "%");
        criteria.andTchNameEqualTo(tchname);
        List<FbTeachingDO> teachings = teachingService.selectByExample(example);
        return new FbResult(FbResultConstant.SUCCESS, BeanUtil.copyList(teachings, FbTeachingDTO.class));
    }


    @ApiOperation("获取课程列表")
    @RequestMapping(value = "/choose/teaching/list", method = RequestMethod.POST)
    @ResponseBody
    public FbResult QueryTeachingList(@RequestParam(required = true, value = "year") String year,
                                      @RequestParam(required = true, value = "term") Byte term,
                                      @RequestParam(required = true, value = "major") String major) {
        if (StringUtils.isEmpty(year) || StringUtils.isEmpty(major)) {
            return new FbResult(FbResultConstant.FAILED, null, "课程问卷查询失败");
        }
        //获取当前登录教师的姓名
        SessionDTO userSession = (SessionDTO) session.getAttribute("userSession");
        String tchname = userSession.getUname();
        FbTeachingDOExample example = new FbTeachingDOExample();
        FbTeachingDOExample.Criteria criteria = example.createCriteria();
        String[] strings = ViewUtil.splitYear(year);
        criteria.andStartYearEqualTo(strings[0]);
        criteria.andEndYearEqualTo(strings[1]);
        criteria.andTermEqualTo(term);
        criteria.andMajorLike("%" + major + "%");
        criteria.andTchNameEqualTo(tchname);
        List<FbTeachingDO> teachings = teachingService.selectByExample(example);
        return new FbResult(FbResultConstant.SUCCESS, BeanUtil.copyList(teachings, FbTeachingDTO.class));
    }

    @ApiOperation(value = "自定义问卷页面")
    @RequestMapping(value = "/custom/create/{teachingId}", method = RequestMethod.GET)
    public String createQuestionnaire(@PathVariable Integer teachingId) {
        SessionDTO userSession = new SessionDTO();
        userSession.setTeachingId(teachingId);
        session.setAttribute("teachingId", teachingId);
        return "/teacher/custom";
    }

    @ApiOperation(value = "自定义问卷")
    @RequestMapping(value = "/custom/createSubmit", method = RequestMethod.POST)
    @ResponseBody
    public String Custom(ModelMap modelMap, RedirectAttributes attrs) {
        Integer teachingId = (Integer) session.getAttribute("teachingId");
        //生成uuid
        String uuid = UUID.randomUUID().toString();
        int aaa = 5525555;
        //获取json数据
        InputStreamReader reader = null;
        String data = null;
        try {
            reader = new InputStreamReader(request.getInputStream(), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[] buff = new char[1024];
        int length = 0;
        while (true) {
            try {
                if (!((length = reader.read(buff)) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            data = new String(buff, 0, length);
            System.out.println(data);
        }
        //插入多选题
        FbMultipleDO fbMultipleDO = new FbMultipleDO();
        fbMultipleDO.setMultipleId(6);
        fbMultipleDO.setUuid(uuid);
        fbMultipleDO.setCtime(System.currentTimeMillis());
        fbMultipleDO.setPartId(2);
        fbMultipleDO.setTeachingId(teachingId);
        System.out.println(teachingId);
        fbMultipleDO.setQtype((byte) 2);
        fbMultipleDO.setContent(data);
        fbMultipleDO.setSort(62);
        fbMultipleDO.setOrders((long) aaa);
        multipleService.insertSelective(fbMultipleDO);
        return "redirect:/choose";

      /*  //插入单选题
        FbSingleDO fbSingleDO = new FbSingleDO();
        FbSingleService fbSingleService = new FbSingleServiceImpl();
        fbSingleDO.setUuid(uuid);
        fbSingleDO.setCtime(System.currentTimeMillis());
        fbSingleDO.setPartId(2);
      //  fbSingleDO.setTeachingId(teachingId);
        fbSingleDO.setQtype((byte) 2);
        fbSingleService.insertSelective(fbSingleDO);*/

    }


    @ApiOperation("登录")
    @RequestMapping(value = "/auth/login", method = RequestMethod.POST)
    public String Login(@RequestParam(required = true, value = "uname") String uname,
                        @RequestParam(required = true, value = "passWord") String passWord,
                        RedirectAttributes attrs) {
        if (StringUtils.isEmpty(uname) || StringUtils.isEmpty(passWord)) {
            attrs.addFlashAttribute("result", new FbResult(FbResultConstant.INVALID_PARAMETER, null));
            try {
                throw new NullPointerException("自定义错误");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "redirect:/teacher/login";
        }

        FbResult result = tchUserService.login(uname, passWord, IpUtil.getIpAddr(request));
        if (result.getCode() != FbResultConstant.SUCCESS.getCode()) {
            attrs.addFlashAttribute("result", result);
            return "redirect:/teacher/login";
        }
        //将教师存入session
        SessionDTO userSession = new SessionDTO();
        userSession.setUname(uname);
        session.setAttribute("userSession", userSession);
        attrs.addFlashAttribute("result", result);
        return "redirect:/teacher/index";

    }
    @ApiOperation(value = "修改密码")
    @RequestMapping(value = "/auth/resetPWD", method = RequestMethod.POST)
    public String resetPWD(@RequestParam(required = true, value = "uname") String uname,
                           @RequestParam(required = true, value = "oldPassword") String oldPassword,
                           @RequestParam(required = true, value = "newPassword") String newPassword,
                           RedirectAttributes attrs) {

        if (StringUtils.isEmpty(uname) || StringUtils.isEmpty(oldPassword) || StringUtils.isEmpty(newPassword)) {
            attrs.addFlashAttribute("result", new FbResult(FbResultConstant.FAILED, null, "用户名或密码不正确"));
        }
        FbResult result = tchUserService.resetPWD(uname, oldPassword, newPassword);
        if (result.getCode() != FbResultConstant.SUCCESS.getCode()) {
            attrs.addFlashAttribute("result", result);
            return "/teacher/authentication-reset-password";
        }
        return "redirect:/teacher/login";
    }

    @ApiOperation(value = "注销")
    @RequestMapping(value = "/auth/loginout", method = RequestMethod.GET)
    public String Loginout(RedirectAttributes attrs) {
        session.removeAttribute("userSession");
        attrs.addFlashAttribute("result", new FbResult(FbResultConstant.SUCCESS, null, "注销成功"));
        return "redirect:/teacher/login";
    }




}

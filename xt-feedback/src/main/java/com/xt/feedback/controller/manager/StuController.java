package com.xt.feedback.controller.manager;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.xt.feedback.common.util.StringUtil;
import com.xt.feedback.dao.dto.FbFixQuestionDTO;
import com.xt.feedback.dao.model.FbTeacherDOExample;
import com.xt.feedback.service.*;
import org.apache.commons.collections.IterableMap;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.xt.feedback.common.base.BaseController;
import com.xt.feedback.common.constant.FbResult;
import com.xt.feedback.common.constant.FbResultConstant;
import com.xt.feedback.common.util.BeanUtil;
import com.xt.feedback.common.util.ViewUtil;
import com.xt.feedback.common.util.IpUtil;
import com.xt.feedback.dao.dto.FbTeachingDTO;
import com.xt.feedback.dao.dto.FbTeachingQuDTO;
import com.xt.feedback.dao.model.FbResultDO;
import com.xt.feedback.dao.model.FbTeachingDO;
import com.xt.feedback.dao.model.FbTeachingDOExample;
import com.xt.feedback.dao.model.FbTeachingDOExample.Criteria;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(value = "学生选择课程")
@RequestMapping("/stu")
public class StuController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StuController.class);

    @Resource
    private HttpServletRequest request;
    @Resource
    private FbTeachingService teachingService;
    @Resource
    private FbTeachingQuService teachingQuService;
    @Resource
    private FbQuestionnaireService questionnaireServce;
    @Resource
    private FbResultService resultService;
    @Resource
    private FbFixQuestionService fixQuestionService;

    @ApiOperation(value = "获取试卷")
        @RequestMapping(value = "/questionnaire", method = RequestMethod.POST)
        public String findQuestionnaire(@RequestParam(required = true, value = "year") String year,
                @RequestParam(required = true, value = "term") Byte term,
                @RequestParam(required = true, value = "major") String major,
                @RequestParam("courseNoAndOrder") String courseNoAndOrder,
                @RequestParam(required = true, value = "tchName") String tchName,
                ModelMap modelMap, RedirectAttributes attrs) {
            if (StringUtils.isEmpty(year) || StringUtils.isEmpty(major) || StringUtils.isEmpty(courseNoAndOrder)
                    || StringUtils.isEmpty(tchName)) {
                modelMap.addAttribute("result", new FbResult(FbResultConstant.INVALID_PARAMETER, null));
                return "redirect:/choose";
            }
        //获取教学记录
        FbTeachingDOExample example = new FbTeachingDOExample();
        Criteria criteria = example.createCriteria();
        criteria.andTermEqualTo(term).andMajorEqualTo(major).andTchNameEqualTo(tchName);
        String[] couseStrings = ViewUtil.splitCourseNo(courseNoAndOrder);
        criteria.andCourseNoEqualTo(couseStrings[0]).andCourseOrderEqualTo(couseStrings[1]);
        String[] strings = ViewUtil.splitYear(year);
        criteria.andStartYearEqualTo(strings[0]);
        criteria.andEndYearEqualTo(strings[1]);
        FbTeachingDO teaching = teachingService.selectFirstByExample(example);
        if (teaching == null) {
            attrs.addFlashAttribute("result", new FbResult(FbResultConstant.FAILED, null, "未找到指定课程"));
            return "/front/questionnaire";
        }
        //获取教学问卷信息
        FbTeachingQuDTO teachingQuDTO = teachingQuService.getTchQuAndQuestionnaire(teaching.getTeachingId(), (byte) 1);
        if (teachingQuDTO == null) {
            attrs.addFlashAttribute("result", new FbResult(FbResultConstant.FAILED, null, "该课程未启用问卷"));
            return "redirect:/choose";
        }
        teachingQuDTO.setTeachingDTO(BeanUtil.copy(teaching, FbTeachingDTO.class));
        List<FbFixQuestionDTO> singleResult = fixQuestionService.listFbFixQuestionDTOsByOrder(1);
        List<FbFixQuestionDTO> multipleResult = fixQuestionService.listFbFixQuestionDTOsByOrder(2);
        modelMap.addAttribute("result", new FbResult(FbResultConstant.SUCCESS, teachingQuDTO));
        modelMap.addAttribute("singleResult", new FbResult(FbResultConstant.SUCCESS, singleResult));
        modelMap.addAttribute("multipleResult", new FbResult(FbResultConstant.SUCCESS, multipleResult));
        return "front/questionnaire";
    }

    @ApiOperation(value = "获取课程列表")
    @RequestMapping(value = "/choose/teaching/list", method = RequestMethod.POST)
    @ResponseBody
    public FbResult findTeachingList(@RequestParam(required = true, value = "year") String year,
                                     @RequestParam(required = true, value = "term") Byte term,
                                     @RequestParam(required = true, value = "major") String major) {
        if (StringUtils.isEmpty(year) || StringUtils.isEmpty(major)) {
            return new FbResult(FbResultConstant.INVALID_PARAMETER, null);
        }
        FbTeachingDOExample example = new FbTeachingDOExample();
        Criteria criteria = example.createCriteria();
        String[] strings = ViewUtil.splitYear(year);
        criteria.andStartYearEqualTo(strings[0]);
        criteria.andEndYearEqualTo(strings[1]);
        criteria.andTermEqualTo(term);
        criteria.andMajorLike("%" + major + "%");
        List<FbTeachingDO> teachings = teachingService.selectByExample(example);
        List<FbTeachingDTO> teachingsDTOS = BeanUtil.copyList(teachings, FbTeachingDTO.class);

        return new FbResult(FbResultConstant.SUCCESS, teachingsDTOS);
    }

    @ApiOperation(value = "添加答案")
    @RequestMapping(value = "/result/create", method = RequestMethod.POST)
    @ResponseBody
    public FbResult createResult(@RequestParam(required = true, value = "tchQuId") int tchQuId,
                                 @RequestParam("fixResult") String fixResult,
                                 @RequestParam("freeResult") String freeResult) {
        if (tchQuId == 0) {
            return new FbResult(FbResultConstant.INVALID_PARAMETER, null);
        }
        FbResultDO resultDO = new FbResultDO();
        resultDO.setTchQuId(tchQuId);
        resultDO.setFixResult(fixResult);
        resultDO.setFreeResult(freeResult);
        resultDO.setIp(IpUtil.getIpAddr(request));
        long time = System.currentTimeMillis();
        resultDO.setOrders(time);
        resultDO.setCtime(time);
        resultService.insertSelective(resultDO);
        return new FbResult(FbResultConstant.SUCCESS, null);
    }


}

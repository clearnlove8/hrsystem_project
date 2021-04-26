package com.ck.handler;

import com.ck.entity.Engage_interview;
import com.ck.entity.Engage_resume;
import com.ck.service.IEngage_interview_Service;
import com.ck.service.IEngage_resume_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.rmi.server.MarshalOutputStream;

import java.util.List;
import java.util.Map;

/**
 * created  on 2021/4/25 20:22
 * liu
 * 面试
 */

@Controller
public class InterviewHandler {

    @Autowired
    private IEngage_interview_Service iEngage_interview_service;
    @Autowired
    private IEngage_resume_Service iEngage_resume_service;



    //进行登记查询
    @RequestMapping("queryByRegister")
    public String queryByRegister(int res_id, Map map){
        Engage_resume engage_resume = iEngage_resume_service.queryByRes_id(res_id);
        map.put("es", engage_resume);
        return  "page/recruit/interview/interview-register";
    }

    //Engage_interview表的登记添加
    @RequestMapping("addEngage_interview")
    public String addEngage_interview(Engage_interview engage_interview){
        iEngage_interview_service.addEngage_interview(engage_interview);
        return "redirect:queryByEngage_interview";
    }


    @RequestMapping("queryByEngage_interview")
    public  String  queryByEngage_interview(Map map){
        List<Engage_interview> engage_interviews = iEngage_interview_service.queryByEngage_interview();
        map.put("engage_interviews", engage_interviews);
        return "page/recruit/interview/sift-list";
    }

    //Engage_interview根据res_id查询(面试筛选)
    @RequestMapping("queryByscreen")
    public String queryByscreen(int res_id,Map map){
        Engage_resume engage_resume = iEngage_resume_service.queryByscreen(res_id);
        map.put("engage_resume", engage_resume);
        return "page/recruit/interview/interview-sift";
    }


    //修改筛选人，时间，状态
    @RequestMapping("updatecheck_status")
    public String updatecheck_status(Engage_interview engage_interview){
        iEngage_interview_service.updatecheck_status(engage_interview);
        return "forward:queryByEngage_interview";
    }




}

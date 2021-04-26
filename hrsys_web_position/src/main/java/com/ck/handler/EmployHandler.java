package com.ck.handler;

import com.ck.entity.Engage_resume;
import com.ck.service.IEngage_interview_Service;
import com.ck.service.IEngage_resume_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * created  on 2021/4/26 10:35
 * liu
 * 审核
 */
@Controller
public class EmployHandler {

    @Autowired
    private IEngage_interview_Service iEngage_interview_service;
    @Autowired
    private IEngage_resume_Service iEngage_resume_service;

    //录用申请数据
    @RequestMapping("queryByTWO")
    public String queryByTWO(Map map){
        List<Engage_resume> engage_resumes = iEngage_resume_service.queryByTWO();
        map.put("engage_interviews", engage_resumes);
        return "page/recruit/employ/register_list";
    };

    //Engage_interview根据res_id查询(录用申请)
    @RequestMapping("queryByproposerRes_id")
    public String queryByproposerRes_id(int res_id,Map map){
        Engage_resume engage_resume = iEngage_resume_service.queryByscreen(res_id);
        map.put("engage_resume", engage_resume);
        return "page/recruit/employ/register";
    }


    //修改审核意见
    @RequestMapping("updatecheck_comment")
    public String updatecheck_comment(Engage_resume engage_interview){
        iEngage_interview_service.updatecheck_comment(engage_interview);
        return "redirect:queryByTWO";
    }

    //录用审批数据
    @RequestMapping("queryByapprover")
    public String queryByapprover(Map map){
        List<Engage_resume> engage_resumes = iEngage_resume_service.queryByapprover();
        map.put("engage_interviews", engage_resumes);
        return "page/recruit/employ/check_list";
    };

    //Engage_interview根据res_id查询(录用审批)
    @RequestMapping("queryByproposerRes_id2")
    public String queryByproposerRes_id2(int res_id,Map map){
        Engage_resume engage_resume = iEngage_resume_service.queryByscreen(res_id);
        map.put("engage_resume", engage_resume);
        return "page/recruit/employ/check";
    }

    //修改审批意见
    @RequestMapping("updatepass_passComment")
    public String updatepass_passComment(Engage_resume engage_resume){
        iEngage_resume_service.updatepass_passComment(engage_resume);
        return "redirect:queryByapprover";
    }

    //录用查询数据
    @RequestMapping("queryEngageAll")
    public String queryEngageAll(Map map){
        List<Engage_resume> engage_resumes = iEngage_resume_service.queryEngageAll();
        map.put("engage_interviews", engage_resumes);
        return "page/recruit/employ/list";
    }

    //录用查询
    @RequestMapping("queryByproposerRes_id3")
    public String queryByproposerRes_id3(int res_id,Map map){
        Engage_resume engage_resume = iEngage_resume_service.queryByscreen(res_id);
        map.put("engage_resume", engage_resume);
        return "page/recruit/employ/details";
    }


}

package com.ck.handler;

import com.ck.entity.Engage_resume;
import com.ck.entity.Public_Char;
import com.ck.service.IEngage_resume_Service;
import com.ck.service.IPublic_Char_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * created  on 2021/4/20 8:56
 * liu
 * 简历控制器
 */
@Controller
public class ResumeHandler {

    @Autowired
    private IPublic_Char_Service iPublic_char_service;
    @Autowired
    private IEngage_resume_Service iEngage_resume_service;

    //查询所有公共字段
    @RequestMapping("JsonQueryPublicChar")
    @ResponseBody
    //以流返回 直接接收
    public List<Public_Char> JsonQueryPublicChar(){
        List<Public_Char> public_char = iPublic_char_service.getPublic_Char();
        return public_char;
    }

    //从页面获取数据进行添加简历
    @RequestMapping("AddEngage_resume")
    public  String AddEngage_resume(Engage_resume engage_resume){
        iEngage_resume_service.AddEngage_resume(engage_resume);
        return "page/recruit/resume/resume-choose";
    }


    //根据多个条件查询简历表(简历筛选)
    @RequestMapping("querySome")
    public String querySome(@RequestParam Map map, ModelMap modelMap){
        List<Engage_resume> engage_resumes = iEngage_resume_service.queryBySome(map);
        modelMap.put("engage_resumes", engage_resumes);
        return "page/recruit/resume/resume-list";
    }


    //根据res_id查询Engage_resume表数据要到resume-details页面
    @RequestMapping("queryByRes_id")
    public String queryByRes_id(int res_id,Map map){
        Engage_resume engage_resume = iEngage_resume_service.queryByRes_id(res_id);
        map.put("e",engage_resume);
        return "page/recruit/resume/resume-details";
    }

    //复核中进行的修改推荐
    @RequestMapping("UpdateEngage_resum")
    public String UpdateEngage_resum(Engage_resume engage_resume){
        iEngage_resume_service.updateEngage_resum(engage_resume);
        return "page/recruit/resume/resume-choose";
    }


    //根据多个条件查询Engage_resume表(有效简历查询)
    @RequestMapping("queryValidSome")
    public String queryValidSome(@RequestParam Map map, ModelMap modelMap){
        List<Engage_resume> engage_resumes = iEngage_resume_service.queryValidSome(map);
        modelMap.put("engage_resume", engage_resumes);
        return "page/recruit/resume/valid-list";
    }

    //根据res_id查询Engage_resume表数据要到resume-select页面
    @RequestMapping("queryByRes_ides")
    public String queryByRes_ides(int res_id,Map map){
        Engage_resume engage_resumes = iEngage_resume_service.queryByRes_id(res_id);
        map.put("engage_resume",engage_resumes);
        return "page/recruit/resume/resume-select";
    }

    //根据多个条件查询Engage_resume表(面试筛选简历)
    @RequestMapping("queryValidSomeM")
    public String queryValidSomeM(@RequestParam Map map, ModelMap modelMap){
        List<Engage_resume> engage_resumes = iEngage_resume_service.queryValidSome(map);
        modelMap.put("engage_resume", engage_resumes);
        return "page/recruit/interview/interview-list";
    }

}

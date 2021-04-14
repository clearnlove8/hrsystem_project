package com.ck.handler;

import com.ck.entity.*;
import com.ck.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.faces.annotation.RequestMap;
import java.util.List;

/**
 * 公共模块的控制器(例如:一级机构、二级机构、三级机构以及公共字段的获取)
 */
@Controller
public class PublicHandler {

    @Autowired
    private IFirst_Kind_Service iFirstKindService;

    @Autowired
    private ISecond_Kind_Service iSecondKindService;

    @Autowired
    private IThird_Kind_Service iThirdKindService;

    @Autowired
    private IMajor_Kind_Service iMajorKindService;

    @Autowired
    private IMajor_Service iMajorService;

    @Autowired
    private IPublic_Char_Service iPublicCharService;

    //直接跳转到登录页面
    @RequestMapping("/")
    public String toLogin(){
        return "login";
    }

    //跳转页面
    @RequestMapping("toPage")
    public String toPage(String page){
        return page;
    }

    //获取一级机构
    @RequestMapping("getFirstKind")
    @ResponseBody
    public List<First_Kind> getFirstKind(){
        List<First_Kind> firstKind = iFirstKindService.getFirstKind();
        return firstKind;
    }


    //获取所有的二级机构
    @RequestMapping("getSecondKind")
    @ResponseBody
    public List<Second_Kind> getSecondKind(){
        List<Second_Kind> secondKind = iSecondKindService.getSecond_Kind();
        return secondKind;
    }

    //获取所有的三级机构
    @RequestMapping("getThirdKind")
    @ResponseBody
    public List<Third_Kind> getThirdKind(){
        List<Third_Kind> thirdKind = iThirdKindService.getThird_Kind();
        return thirdKind;
    }


    //根据一级机构编号获取二级机构
    @RequestMapping("getSecondKindById")
    @ResponseBody
    public List<Second_Kind> getSecondKindById(int first_kind_id){
        return iSecondKindService.getSecond_KindById(first_kind_id);
    }

    //根据二级机构编号获取三级机构
    @RequestMapping("getThirdKindById")
    @ResponseBody
    public List<Third_Kind> getThirdKindById(int second_kind_id){
        return iThirdKindService.getThird_KindById(second_kind_id);
    }

    //获取所有职称分类信息
    @RequestMapping("getMajorKind")
    @ResponseBody
    public List<Major_Kind> getMajorKind(){
        return iMajorKindService.getMajor_Kind();
    }

    //获取所有职位名称
    @RequestMapping("getMajor")
    @ResponseBody
    public List<Major> getMajor(){
        return iMajorService.getMajor();
    }

    //根据职称分类获取职位名称
    @RequestMapping("getMajorById")
    @ResponseBody
    public List<Major> getMajorById(int major_kind_id){
        return iMajorService.get_MajorById(major_kind_id);
    }

    //获取所有的公共字段
    @RequestMapping("getPublicChar")
    @ResponseBody
    public List<Public_Char> getPublicChar(){
        return iPublicCharService.getPublic_Char();
    }
}

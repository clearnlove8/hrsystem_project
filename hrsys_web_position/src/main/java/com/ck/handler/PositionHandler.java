package com.ck.handler;

import com.ck.entity.Engage_major_release;
import com.ck.service.IEngage_major_release_Service;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * created  on 2021/4/12 16:01
 * liu
 * 职位信息handler
 */
@Controller
public class PositionHandler {

    @Autowired
    private IEngage_major_release_Service iEngage_major_release_service;

    //进行发布登记
    @RequestMapping("AddEngage_major_release")
    public String AddEngage_major_release(Engage_major_release engage_major_release){
        iEngage_major_release_service.AddEngage_major_release(engage_major_release);
        return  "forward:UpdateEngage_major_release?currentPage=1&PageSize=3";
    }

    //查询职位发布
    @RequestMapping("QueryEngage_major_release")
    public  String QueryEngage_major_release(int currentPage ,int PageSize,@RequestParam(required = false)Integer countPage, Map map) {
        if (countPage!=null){
            if (currentPage>countPage){
                currentPage=countPage;
            }
            if (currentPage<1){
                currentPage=1;
            }
        }
        Page<Object> pages= iEngage_major_release_service.QueryEngage_major_release(currentPage, PageSize);
        map.put("pages", pages);
        return "page/recruit/position/position_release_search";
    }

    //职位发布变更
    @RequestMapping("UpdateEngage_major_release")
    public String UpdateEngage_major_release(int currentPage ,int PageSize,@RequestParam(required = false)Integer countPage, Map map){
//        List<Engage_major_release> engage_major_releases = iEngage_major_release_service.QueryEngage_major_release();
//        map.put("zhiWei", engage_major_releases);
        if (countPage!=null){
            if (currentPage>countPage){
                currentPage=countPage;
            }
            if (currentPage<1){
                currentPage=1;
            }
        }
        Page<Object> pages= iEngage_major_release_service.QueryEngage_major_release(currentPage, PageSize);
        map.put("pages", pages);
        return "page/recruit/position/position_change_update";
    }

    //修改之前先查询要修改的数据
    @RequestMapping("QueryEngage_major_releaseById")
    public String QueryEngage_major_releaseById(int id,Map map){
        Engage_major_release engage_major_release = iEngage_major_release_service.QueryEngage_major_releaseById(id);
        map.put("U", engage_major_release);
        return "page/recruit/position/position_release_change";
    }

    //进行修改职位信息
    @RequestMapping("ChangEngage_major_release")
    public  String ChangEngage_major_release(Engage_major_release engage_major_release){
        iEngage_major_release_service.UpdateEngage_major_release(engage_major_release );
        return "forward:UpdateEngage_major_release?currentPage=1&PageSize=3";
    }


    @RequestMapping("ajaxDeleteEngage_major_release")
    @ResponseBody
    // ctrl+alt+t
    public String ajaxDeleteEngage_major_release(int id){
        try {
            iEngage_major_release_service.DelEngage_major_releaseById(id);
            return "yes";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
}

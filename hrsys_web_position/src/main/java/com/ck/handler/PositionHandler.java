package com.ck.handler;

import com.ck.entity.Engage_major_release;
import com.ck.service.IEngage_major_release_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return  "forward:toPage?page=page/recruit/position/position_change_update.html";
    }


}

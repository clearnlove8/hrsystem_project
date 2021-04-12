package com.ck.handler;

import com.ck.entity.Human_File;
import com.ck.service.IHuman_File_Service;
import com.ck.utils.TenantCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
/**
 * Tile:人力资源档案管理(处理器)
 * Author:何盼
 * Time:2021/4/11
 */
public class HumanFileHandler {

    @Autowired
    private IHuman_File_Service iHumanFileService;

    @RequestMapping(value = "addHumanFile",method = RequestMethod.POST)
    public String addHumanFile(Human_File humanFile){
        //设置档案编号
        humanFile.setHuman_id(TenantCode.AutoGenCode());
        //添加
        iHumanFileService.addHumanFile(humanFile);
        return "page/humanResources/human_register";
    }
}

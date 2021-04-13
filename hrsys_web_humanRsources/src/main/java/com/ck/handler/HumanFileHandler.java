package com.ck.handler;

import com.ck.entity.Human_File;
import com.ck.service.IHuman_File_Service;
import com.ck.utils.TenantCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
/**
 * Tile:人力资源档案管理(处理器)
 * Author:何盼
 * Time:2021/4/11
 */
public class HumanFileHandler {

    @Autowired
    private IHuman_File_Service iHumanFileService;


    /**
     * 添加职员档案信息
     * @param humanFile
     * @return
     */
    @RequestMapping(value = "addHumanFile",method = RequestMethod.POST)
    public String addHumanFile(Human_File humanFile,  MultipartFile file, HttpSession session){
        //获取上传文件的名称
        String filename = file.getOriginalFilename();
        //上传
        //1.获取upload目录在web中的真实路径
        String path = session.getServletContext().getRealPath("upload/");
        // 2、处理上传文件的文件重名问题，将文件名换成时间戳
        String oldFileName = filename.substring(0, filename.lastIndexOf("."));
        String newFileName = filename.replace(oldFileName, System.currentTimeMillis() + "");
        //3、正式上传
        try {
            file.transferTo(new File(path+newFileName));
            //设置照片字段名称
            humanFile.setHuman_picture(newFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //设置档案编号
        humanFile.setHuman_id(TenantCode.AutoGenCode());
        //添加
        iHumanFileService.addHumanFile(humanFile);
        return "page/humanResources/human_register";
    }


    /**
     * 查询所有待复核的职员信息
     * @return
     */
    @RequestMapping("getHumanFile")
    public String getHumanFile(Map map){
        //查询待复核员工
        List<Human_File> humanFiles = iHumanFileService.getHumanFile();
        //添加模型数据
        map.put("humanFiles",humanFiles);
        return "page/humanResources/check_list";
    }

    @RequestMapping("getHumanFileById")
    public String getHumanFileById(String human_id,Map map){
        Human_File humanFile = iHumanFileService.getHumanFileById(human_id);
        //添加模型数据
        map.put("humanFile",humanFile);
        return "page/humanResources/human_check";
    }


    //复核职员档案信息
    @RequestMapping("checkHumanFile")
    public String checkHumanFile(Human_File humanFile){
        iHumanFileService.checkHumanFile(humanFile);
        return "page/humanResources/success";
    }
}

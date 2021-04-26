package com.ck.service;

import com.ck.entity.Engage_resume;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * created  on 2021/4/20 8:54
 * liu
 * 简历业务层
 */
public interface IEngage_resume_Service {
    //进行添加简历
    void  AddEngage_resume(Engage_resume engage_resume);


    //根据多个条件查询Engage_resume表(简历筛选)
    List<Engage_resume> queryBySome(Map map);

    //根据id查询Engage_resume表
    public Engage_resume queryByRes_id(int res_id);

    //根据多个条件查询Engage_resume表 有效简历查询
    public List<Engage_resume> queryValidSome(Map map);

    //复核进行修改数据
    public void updateEngage_resum(Engage_resume engage_resume);

    //筛选查询显示到界面上(面试筛选)
    public Engage_resume queryByscreen(int res_id);

    //录用申请数据
    public List<Engage_resume> queryByTWO();


    //录用审批数据
    public List<Engage_resume> queryByapprover();

    //修改审批意见
    public void updatepass_passComment(Engage_resume engage_resume);

    //录用查询数据
    public List<Engage_resume> queryEngageAll();
}

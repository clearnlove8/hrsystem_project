package com.ck.service.impl;

import com.ck.dao.IEngage_resume_Dao;
import com.ck.entity.Engage_resume;
import com.ck.service.IEngage_resume_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * created  on 2021/4/20 8:54
 * liu
 * 简历实现类
 */
@Service
public class IEngage_resume_ServiceImpl implements IEngage_resume_Service {

    @Autowired
    private IEngage_resume_Dao iEngage_resume_dao;

    @Override
    public void AddEngage_resume(Engage_resume engage_resume) {
        //传入实体类进行添加简历
        iEngage_resume_dao.AddEngage_resume(engage_resume);
    }


    @Override
    public List<Engage_resume> queryBySome(Map map) {
        //多条件查询简历筛选
        return iEngage_resume_dao.queryBySome(map);
    }

    @Override
    public Engage_resume queryByRes_id(int res_id) {
        //根据id查询
        return iEngage_resume_dao.queryByRes_id(res_id);
    }

    @Override
    public List<Engage_resume> queryValidSome(Map map) {
        //查询有效简历
        return iEngage_resume_dao.queryValidSome(map);
    }

    @Override
    public void updateEngage_resum(Engage_resume engage_resume) {
        //进行复核修改
    iEngage_resume_dao.updateEngage_resum(engage_resume);
    }

    @Override
    public Engage_resume queryByscreen(int res_id) {
        return iEngage_resume_dao.queryByscreen(res_id);
    }

    @Override
    public List<Engage_resume> queryByTWO() {
        return iEngage_resume_dao.queryByTWO();
    }

    @Override
    public List<Engage_resume> queryByapprover() {
        return iEngage_resume_dao.queryByapprover();
    }

    @Override
    public void updatepass_passComment(Engage_resume engage_resume) {
        iEngage_resume_dao.updatepass_passComment(engage_resume);
    }

    @Override
    public List<Engage_resume> queryEngageAll() {
        return iEngage_resume_dao.queryEngageAll();
    }


}

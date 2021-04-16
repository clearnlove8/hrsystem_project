package com.ck.service.impl;

import com.ck.dao.IEngage_major_release_Dao;
import com.ck.entity.Engage_major_release;
import com.ck.service.IEngage_major_release_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created  on 2021/4/12 15:38
 * liu
 * 职业发布登记接口实现类
 */
@Service
public class IEngage_major_release_ServiceImpl implements IEngage_major_release_Service {

    @Autowired
    private IEngage_major_release_Dao iEngage_major_release_dao;

    @Override
    //进行职业发布
    public void AddEngage_major_release(Engage_major_release engage_major_release) {
        iEngage_major_release_dao.AddEngage_major_release(engage_major_release);
    }

    //查询职业发布信息
    @Override
    public List<Engage_major_release> QueryEngage_major_release() {
        return iEngage_major_release_dao.QueryEngage_major_release();
    }

    //修改职业发布信息
    @Override
    public void UpdateEngage_major_release(Engage_major_release engage_major_release) {
       iEngage_major_release_dao.UpdateEngage_major_release(engage_major_release);
    }

    //根据id查询
    @Override
    public Engage_major_release QueryEngage_major_releaseById(int id) {
        return iEngage_major_release_dao.QueryEngage_major_releaseById(id);
    }

    //根据id删除
    @Override
    public void DelEngage_major_releaseById(int id) {
    iEngage_major_release_dao.DelEngage_major_releaseById(id);
    }
}

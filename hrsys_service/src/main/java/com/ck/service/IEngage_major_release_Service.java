package com.ck.service;

import com.ck.entity.Engage_major_release;

import java.util.List;

/**
 * created  on 2021/4/12 15:36
 * liu
 * 职业发布接口
 */
public interface IEngage_major_release_Service {

    //进行职业发布
    void  AddEngage_major_release(Engage_major_release engage_major_release);

    //查询职业发布
    List<Engage_major_release> QueryEngage_major_release();

    //修改职业发布信息
    void  UpdateEngage_major_release (Engage_major_release  engage_major_release);

    //根据id查询职业发布信息
    Engage_major_release QueryEngage_major_releaseById(int id);

    //根据id删除需要删除的职业信息
    void  DelEngage_major_releaseById(int id );
}

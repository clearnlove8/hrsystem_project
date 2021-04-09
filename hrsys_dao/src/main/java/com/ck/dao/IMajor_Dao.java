package com.ck.dao;

import com.ck.entity.Major;

import java.util.List;

/**
 * Title:职称名称(DAO接口)
 * Author:何盼
 * Time:2021/4/09
 */
public interface IMajor_Dao {

    //根据职称分类编号查询所对应的所有职称
    public List<Major> get_MajorById(int major_kind_id);
}

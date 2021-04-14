package com.ck.service;

import com.ck.entity.Major;

import java.util.List;

/**
 * Title:职位名称(Service接口)
 * Author:何盼
 * Time:2021/4/09
 */
public interface IMajor_Service {

    //根据职称分类编号查询所对应的所有职称
    public List<Major> get_MajorById(int major_kind_id);

    //查询所有的职位名称
    public List<Major> getMajor();
}

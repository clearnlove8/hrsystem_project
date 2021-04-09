package com.ck.service;

import com.ck.entity.Major_Kind;

import java.util.List;

/**
 * Title:职称分类(Service接口)
 * Author:何盼
 * Time:2021/4/09
 */
public interface IMajor_Kind_Service {
    //查询所有的职称分类
    public List<Major_Kind> getMajor_Kind();
}

package com.ck.dao;

import com.ck.entity.First_Kind;

import java.util.List;

/**
 * Title:一级机构(DAO接口)
 * Author:何盼
 * Time:2021/4/09
 */
public interface IFirst_Kind_Dao {

    //查询所有的一级机构名称
    public List<First_Kind> getFirstKind();


}

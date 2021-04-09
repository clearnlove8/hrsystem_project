package com.ck.dao;

import com.ck.entity.Second_Kind;

import java.util.List;

/**
 * Title:二级机构(DAO接口)
 * Author:何盼
 * Time:2021/4/09
 */
public interface ISecond_Kind_Dao {

    //根据一级机构的编号查询所有对应的二级机构
    public List<Second_Kind> getSecond_KindById(int first_kind_id);
}

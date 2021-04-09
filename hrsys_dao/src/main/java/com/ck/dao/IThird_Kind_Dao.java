package com.ck.dao;

import com.ck.entity.Third_Kind;

import java.util.List;

/**
 * Title:三级机构(DAO接口)
 * Author:何盼
 * Time:2021/4/09
 */
public interface IThird_Kind_Dao {

    //根据二级机构编号查询所对应的三级机构
    public List<Third_Kind> getThird_KindById(int second_kind_id);

}

package com.ck.service;

import com.ck.entity.Public_Char;

import java.util.List;

/**
 * Title:公共字段(Service接口)
 * Author:何盼
 * Time:2021/4/09
 */
public interface IPublic_Char_Service {
    //查询所有的公共字段
    public List<Public_Char> getPublic_Char();
}

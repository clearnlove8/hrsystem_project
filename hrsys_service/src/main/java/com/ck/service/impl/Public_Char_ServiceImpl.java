package com.ck.service.impl;

import com.ck.dao.IPublic_Char_Dao;
import com.ck.entity.Public_Char;
import com.ck.service.IPublic_Char_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title:功能字段(Service接口实现类)
 * Author:何盼
 * Time:2021/4/09
 */
@Service
public class Public_Char_ServiceImpl implements IPublic_Char_Service {

    @Autowired
    private IPublic_Char_Dao iPublicCharDao;

    @Override
    public List<Public_Char> getPublic_Char() {
        return iPublicCharDao.getPublic_Char();
    }
}

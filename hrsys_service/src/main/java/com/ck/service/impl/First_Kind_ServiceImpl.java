package com.ck.service.impl;

import com.ck.dao.IFirst_Kind_Dao;
import com.ck.entity.First_Kind;
import com.ck.service.IFirst_Kind_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title:一级机构(Service接口实现类)
 * Author:何盼
 * Time:2021/4/09
 */
@Service
public class First_Kind_ServiceImpl implements IFirst_Kind_Service {

    @Autowired
    private IFirst_Kind_Dao iFirstKindDao;

    @Override
    public List<First_Kind> getFirstKind() {
        return iFirstKindDao.getFirstKind();
    }
}

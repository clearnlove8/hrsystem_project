package com.ck.service.impl;

import com.ck.dao.ISecond_Kind_Dao;
import com.ck.entity.Second_Kind;
import com.ck.service.ISecond_Kind_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title:二级机构(Service接口实现类)
 * Author:何盼
 * Time:2021/4/09
 */
@Service
public class Second_Kind_ServiceImpl implements ISecond_Kind_Service {

    @Autowired
    private ISecond_Kind_Dao iSecondKindDao;

    @Override
    public List<Second_Kind> getSecond_KindById(int first_kind_id) {
        return iSecondKindDao.getSecond_KindById(first_kind_id);
    }

    @Override
    public List<Second_Kind> getSecond_Kind() {
        return iSecondKindDao.getSecond_Kind();
    }
}

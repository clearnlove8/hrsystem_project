package com.ck.service.impl;

import com.ck.dao.IMajor_Kind_Dao;
import com.ck.entity.Major_Kind;
import com.ck.service.IMajor_Kind_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title:职称分类(Service接口实现类)
 * Author:何盼
 * Time:2021/4/09
 */
@Service
public class Major_Kind_ServiceImpl implements IMajor_Kind_Service {

    @Autowired
    private IMajor_Kind_Dao iMajorKindDao;

    @Override
    public List<Major_Kind> getMajor_Kind() {
        return iMajorKindDao.getMajor_Kind();
    }
}

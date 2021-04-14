package com.ck.service.impl;


import com.ck.dao.IMajor_Dao;
import com.ck.entity.Major;
import com.ck.service.IMajor_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title:职位名称(Service接口实现类)
 * Author:何盼
 * Time:2021/4/09
 */
@Service
public class Major_ServiceImpl implements IMajor_Service {

    @Autowired
    private IMajor_Dao iMajorDao;

    @Override
    public List<Major> get_MajorById(int major_kind_id) {
        return iMajorDao.get_MajorById(major_kind_id);
    }

    @Override
    public List<Major> getMajor() {
        return iMajorDao.getMajor();
    }
}

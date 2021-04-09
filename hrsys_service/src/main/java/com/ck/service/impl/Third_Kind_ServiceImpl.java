package com.ck.service.impl;

import com.ck.dao.IThird_Kind_Dao;
import com.ck.entity.Third_Kind;
import com.ck.service.IThird_Kind_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title:三级机构(Service接口实现类)
 * Author:何盼
 * Time:2021/4/09
 */
@Service
public class Third_Kind_ServiceImpl implements IThird_Kind_Service {

    @Autowired
    private IThird_Kind_Dao iThirdKindDao;

    @Override
    public List<Third_Kind> getThird_KindById(int second_kind_id) {
        return iThirdKindDao.getThird_KindById(second_kind_id);
    }
}

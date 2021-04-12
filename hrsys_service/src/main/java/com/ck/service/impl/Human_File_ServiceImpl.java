package com.ck.service.impl;

import com.ck.dao.IHuman_File_Dao;
import com.ck.entity.Human_File;
import com.ck.service.IHuman_File_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Title:人力资源档案(Service接口实现类)
 * Author:何盼
 * Time:2021/4/11
 */
@Service
public class Human_File_ServiceImpl implements IHuman_File_Service {

    @Autowired
    private IHuman_File_Dao iHumanFileDao;

    @Override
    public void addHumanFile(Human_File humanFile) {
        iHumanFileDao.addHumanFile(humanFile);
    }
}

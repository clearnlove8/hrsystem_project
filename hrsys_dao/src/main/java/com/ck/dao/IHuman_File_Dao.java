package com.ck.dao;

import com.ck.entity.Human_File;

/**
 * Title:人力资源档案(DAO接口)
 * Author:何盼
 * Time:2021/4/11
 */
public interface IHuman_File_Dao {

    //添加新入职员工档案信息
    public void addHumanFile(Human_File humanFile);
}

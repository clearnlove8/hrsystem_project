package com.ck.dao;

import com.ck.entity.Human_File;

import java.util.List;

/**
 * Title:人力资源档案(DAO接口)
 * Author:何盼
 * Time:2021/4/11
 */
public interface IHuman_File_Dao {

    //添加新入职员工档案信息
    public void addHumanFile(Human_File humanFile);

    //查询所有待复核的职员信息
    public List<Human_File> getHumanFile();

    //根据职员编号查询该职员信息
    public Human_File getHumanFileById(String human_id);

    //复核职员档案信息
    public void checkHumanFile(Human_File humanFile);
}

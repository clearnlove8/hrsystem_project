package com.ck.service.impl;

import com.ck.dao.IEngage_interviewDao;
import com.ck.entity.Engage_interview;
import com.ck.entity.Engage_resume;
import com.ck.service.IEngage_interview_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created  on 2021/4/25 20:17
 * liu
 * 面试
 */
@Service
public class IEngage_interview_ServiceImpl implements IEngage_interview_Service {

    @Autowired
    private IEngage_interviewDao iengage_interviewDao;
    //Engage_interview表的登记添加
    @Override
    public void addEngage_interview(Engage_interview engage_interview) {
        iengage_interviewDao.addEngage_interview(engage_interview);
    }

    //Engage_interview表的筛选查询
    @Override
    public List<Engage_interview> queryByEngage_interview() {
        return iengage_interviewDao.queryByEngage_interview();
    }

    //筛选查询显示到界面上
    @Override
    public Engage_interview queryBymapscreen2(int resume_id) {
        return iengage_interviewDao.queryBymapscreen2(resume_id);
    }

    //修改筛选人，时间，状态
    @Override
    public void updatecheck_status(Engage_interview engage_interview) {
        iengage_interviewDao.updatecheck_status(engage_interview);
    }

    //修改审核意见
    @Override
    public void updatecheck_comment(Engage_resume engage_resume) {
        iengage_interviewDao.updatecheck_comment(engage_resume);
    }

    //Engage_interview表的审批查询(check_comment为通过)
    @Override
    public List<Engage_interview> queryByapproval() {
        return iengage_interviewDao.queryByapproval();
    }
}

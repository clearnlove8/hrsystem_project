package com.ck.service;

import com.ck.entity.Engage_interview;
import com.ck.entity.Engage_resume;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * liu
 * 面试
 */

public interface IEngage_interview_Service {

    //Engage_interview表的登记添加
    public void addEngage_interview(Engage_interview engage_interview);

    //Engage_interview表的筛选查询
    public List<Engage_interview> queryByEngage_interview();

    //Engage_interview根据res_id查询
    public Engage_interview queryBymapscreen2(int resume_id);

    //修改筛选人，时间，状态
    public void updatecheck_status(Engage_interview engage_interview);

    //修改审核意见
    public void updatecheck_comment(Engage_resume engage_resume);

    //Engage_interview表的审批查询(check_comment为通过)
    public List<Engage_interview> queryByapproval();
}

package com.ck.dao;

import com.ck.entity.Engage_interview;
import com.ck.entity.Engage_resume;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IEngage_interviewDao {

    //Engage_interview表的登记添加
    @Insert("INSERT INTO Engage_interview VALUES(0,#{human_name},#{interview_amount},#{human_major_kind_id},#{human_major_kind_name},#{human_major_id},#{human_major_name},\n" +
            "#{image_degree},#{native_language_degree},#{foreign_language_degree},#{response_speed_degree},#{EQ_degree},#{IQ_degree},#{multi_quality_degree},#{register},null,#{registe_time},null,#{resume_id},null,null,null,0,0);")
    public void addEngage_interview(Engage_interview engage_interview);


    //Engage_interview表的筛选查询
    @Select("SELECT DISTINCT* FROM Engage_interview")
    public List<Engage_interview> queryByEngage_interview();

    //Engage_interview表的审批查询(check_comment为通过)
    @Select("SELECT * FROM `Engage_interview` WHERE check_comment = '通过'")
    public List<Engage_interview> queryByapproval();

    //Engage_interview根据res_id查询
    @Select("SELECT * FROM Engage_interview where resume_id = #{res_id}")
    public Engage_interview queryBymapscreen2(int resume_id);

    //修改筛选人，时间，状态
    @Update("UPDATE `Engage_interview` SET checker = #{checker},check_time= #{check_time},check_status = #{check_status} WHERE ein_id = #{ein_id}")
    public void updatecheck_status(Engage_interview engage_interview);

    //修改审核意见
    @Update("UPDATE `Engage_resume` SET pass_checkComment = #{pass_checkComment} WHERE res_id = #{res_id}")
    public void updatecheck_comment(Engage_resume engage_resume);


}

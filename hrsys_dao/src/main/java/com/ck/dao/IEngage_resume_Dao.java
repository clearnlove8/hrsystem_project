package com.ck.dao;

import com.ck.entity.Engage_resume;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * created  on 2021/4/20 8:51
 * liu
 * 简历接口
 */
public interface IEngage_resume_Dao {


    //添加简历数据
    @Insert("INSERT INTO Engage_resume(human_name,engage_type,human_address,human_postcode,human_major_kind_id,human_major_kind_name,human_major_id,\n" +
            "\t\thuman_major_name,human_telephone,human_homephone,human_mobilephone,human_email,human_hobby,human_specility,human_sex,\n" +
            "\t\thuman_religion,human_party,human_nationality,human_race,human_birthday,human_age,human_educated_degree,human_educated_years,\n" +
            "\t\thuman_educated_major,human_college,human_idcard,human_birthplace,demand_salary_standard,human_history_records,remark,regist_time,pass_check_status,register,interview_status) \n" +
            "\t\tVALUES(#{human_name},#{engage_type},#{human_address},#{human_postcode},#{human_major_kind_id},#{human_major_kind_name},#{human_major_id}," +
            "#{human_major_name},#{human_telephone},#{human_homephone},#{human_mobilephone},#{human_email},#{human_hobby},#{human_specility},#{human_sex}," +
            "#{human_religion},#{human_party},#{human_nationality},#{human_race},#{human_birthday},#{human_age},#{human_educated_degree},#{human_educated_years}," +
            "#{human_educated_major},#{human_college},#{human_idcard},#{human_birthplace},#{demand_salary_standard},#{human_history_records},#{remark},#{regist_time},0,#{register},#{interview_status})")
    void  AddEngage_resume(Engage_resume engage_resume);


    //根据多个条件查询Engage_resume表 简历筛选
    List<Engage_resume> queryBySome(Map map);

    //根据id查询Engage_resume表
    @Select("select * from Engage_resume where res_id = #{res_id}")
    public Engage_resume queryByRes_id(int res_id);

    //根据多个条件查询Engage_resume表 有效简历查询
    public List<Engage_resume> queryValidSome(Map map);

    //复核进行修改数据
    @Update("UPDATE Engage_resume SET human_name =#{human_name},human_email=#{human_email},human_telephone = #{human_telephone},human_homephone =#{human_homephone},\n" +
            "human_mobilephone =#{human_mobilephone},human_address =#{human_address},human_postcode = #{human_postcode},human_nationality =#{human_nationality},human_birthplace =#{human_birthplace},\n" +
            "human_birthday =#{human_birthday},human_religion =#{human_religion},human_party = #{human_party},human_idcard =#{human_idcard},human_age = #{human_age},human_college =#{human_college},\n" +
            "human_educated_degree =#{human_educated_degree},human_educated_years =#{human_educated_years},human_educated_major =#{human_educated_major},demand_salary_standard =#{demand_salary_standard},\n" +
            "regist_time =#{regist_time},human_specility = #{human_specility},human_hobby =#{human_hobby},pass_checker =#{pass_checker},pass_check_time =#{pass_check_time},human_history_records =#{human_history_records},\n" +
            "remark =#{remark},recomandation =#{recomandation},pass_check_status = 1 WHERE res_id = #{res_id};")
    public void updateEngage_resum(Engage_resume engage_resume);


    //筛选查询显示到界面上(面试筛选)
    @Select("select * from Engage_resume where res_id = #{res_id}")
    @ResultMap("mapscreen")
    public Engage_resume queryByscreen(int res_id);

    //录用申请数据
    @Select("SELECT * FROM `Engage_resume` e INNER JOIN `Engage_interview`  w ON  e.res_id = w.resume_id WHERE w.check_status = 3 ")
    public List<Engage_resume> queryByTWO();


    //录用审批数据
    @Select("SELECT * FROM `Engage_resume` e INNER JOIN `Engage_interview`  w ON  e.res_id = w.resume_id WHERE w.check_status = 3 AND e.pass_checkComment = '通过' and e.pass_passComment ='待通过'")
    public List<Engage_resume> queryByapprover();

    //修改审核意见
    @Update("UPDATE `Engage_resume` SET pass_passComment = #{pass_passComment}  WHERE res_id = #{res_id}")
    public void updatepass_passComment(Engage_resume engage_resume);


    //录用查询数据
    @Select("SELECT * FROM `Engage_resume` e INNER JOIN `Engage_interview`  w ON  e.res_id = w.resume_id WHERE w.check_status = 3 AND e.pass_checkComment = '通过' and pass_passComment = '通过'")
    public List<Engage_resume> queryEngageAll();

}

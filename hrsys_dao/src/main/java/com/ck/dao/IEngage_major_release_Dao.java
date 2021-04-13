package com.ck.dao;

import com.ck.entity.Engage_major_release;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * created  on 2021/4/12 14:51
 * liu
 * 职业发布接口
 */
public interface IEngage_major_release_Dao {

    //进行职业发布
    void  AddEngage_major_release(Engage_major_release engage_major_release);

    //查询职业发布信息
    List<Engage_major_release> QueryEngage_major_release();


    //修改职业发布信息
    @Update("UPDATE Engage_major_release SET engage_type=#{engage_type},human_amount=#{human_amount},deadline=#{deadline},changer=#{changer},regist_time=#{regist_time},major_describe=#{major_describe},engage_required=#{engage_required} WHERE mre_id=#{mre_id}")
    void  UpdateEngage_major_release (Engage_major_release  engage_major_release);

    //根据id查询职业发布信息
    @Select("select * from Engage_major_release where mre_id=#{id}")
    Engage_major_release QueryEngage_major_releaseById(int id);

    //根据id删除需要删除的职业信息
    @Delete("delete from Engage_major_release where mre_id=#{id} ")
    void  DelEngage_major_releaseById(int id );
}

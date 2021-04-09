package com.ck.entity;

/**
 * Title:职位分类
 * Author:何盼
 * Time:2021/4/09
 */
public class Major_Kind {
    //主键
    private  int mfk_id;
    //职位分类编号
    private int major_kind_id;
    //职分类位名称
    private String major_kind_name;

    public int getMfk_id() {
        return mfk_id;
    }

    public void setMfk_id(int mfk_id) {
        this.mfk_id = mfk_id;
    }

    public int getMajor_kind_id() {
        return major_kind_id;
    }

    public void setMajor_kind_id(int major_kind_id) {
        this.major_kind_id = major_kind_id;
    }

    public String getMajor_kind_name() {
        return major_kind_name;
    }

    public void setMajor_kind_name(String major_kind_name) {
        this.major_kind_name = major_kind_name;
    }

    @Override
    public String toString() {
        return "Major_Kind{" +
                "mfk_id=" + mfk_id +
                ", major_kind_id=" + major_kind_id +
                ", major_kind_name='" + major_kind_name + '\'' +
                '}';
    }
}

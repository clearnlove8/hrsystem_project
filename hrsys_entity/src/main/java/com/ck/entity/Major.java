package com.ck.entity;

/**
 * Title:职位名称
 * Author:何盼
 * Time:2021/4/09
 */
public class Major {
    //主键，自动增长列
    private int mak_id;
    //职位分类编号(外健：Config_major_kind 表中的：major_kind_id)
    private int major_kind_id;
    //职位分类名称
    private String major_kind_name;
    //职位编号
    private int major_id;
    //职位名称
    private String major_name;
    //题套数量
    private int test_amount;

    public int getMak_id() {
        return mak_id;
    }

    public void setMak_id(int mak_id) {
        this.mak_id = mak_id;
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

    public int getMajor_id() {
        return major_id;
    }

    public void setMajor_id(int major_id) {
        this.major_id = major_id;
    }

    public String getMajor_name() {
        return major_name;
    }

    public void setMajor_name(String major_name) {
        this.major_name = major_name;
    }

    public int getTest_amount() {
        return test_amount;
    }

    public void setTest_amount(int test_amount) {
        this.test_amount = test_amount;
    }

    @Override
    public String toString() {
        return "Major{" +
                "mak_id=" + mak_id +
                ", major_kind_id=" + major_kind_id +
                ", major_kind_name='" + major_kind_name + '\'' +
                ", major_id=" + major_id +
                ", major_name='" + major_name + '\'' +
                ", test_amount=" + test_amount +
                '}';
    }
}

package com.ck.entity;

/**
 * Title:三级机构
 * Author:何盼
 * Time:2021/4/09
 */
public class Third_Kind {
    //主键
    private int ftk_id;
    //一级机构编号(外健：Config_file_first_kind 表中的：first_kind_id)
    private int first_kind_id;
    //一级机构名称
    private String first_kind_name;
    //二级机构编号(外健：Config_file_second_kind 表中的：second_kind_id)
    private int second_kind_id;
    //二级机构名称
    private String second_kind_name;
    //三级机构编号
    private int third_kind_id;
    //三级机构名称
    private String third_kind_name;
    //三级机构销售责任人编号
    private int third_kind_sale_id;
    //三级机构是否为零售店(1:是 2:不是)
    private int third_kind_is_retail;

    public int getFtk_id() {
        return ftk_id;
    }

    public void setFtk_id(int ftk_id) {
        this.ftk_id = ftk_id;
    }

    public int getFirst_kind_id() {
        return first_kind_id;
    }

    public void setFirst_kind_id(int first_kind_id) {
        this.first_kind_id = first_kind_id;
    }

    public String getFirst_kind_name() {
        return first_kind_name;
    }

    public void setFirst_kind_name(String first_kind_name) {
        this.first_kind_name = first_kind_name;
    }

    public int getSecond_kind_id() {
        return second_kind_id;
    }

    public void setSecond_kind_id(int second_kind_id) {
        this.second_kind_id = second_kind_id;
    }

    public String getSecond_kind_name() {
        return second_kind_name;
    }

    public void setSecond_kind_name(String second_kind_name) {
        this.second_kind_name = second_kind_name;
    }

    public int getThird_kind_id() {
        return third_kind_id;
    }

    public void setThird_kind_id(int third_kind_id) {
        this.third_kind_id = third_kind_id;
    }

    public String getThird_kind_name() {
        return third_kind_name;
    }

    public void setThird_kind_name(String third_kind_name) {
        this.third_kind_name = third_kind_name;
    }

    public int getThird_kind_sale_id() {
        return third_kind_sale_id;
    }

    public void setThird_kind_sale_id(int third_kind_sale_id) {
        this.third_kind_sale_id = third_kind_sale_id;
    }

    public int getThird_kind_is_retail() {
        return third_kind_is_retail;
    }

    public void setThird_kind_is_retail(int third_kind_is_retail) {
        this.third_kind_is_retail = third_kind_is_retail;
    }

    @Override
    public String toString() {
        return "Third_Kind{" +
                "ftk_id=" + ftk_id +
                ", first_kind_id=" + first_kind_id +
                ", first_kind_name='" + first_kind_name + '\'' +
                ", second_kind_id=" + second_kind_id +
                ", second_kind_name='" + second_kind_name + '\'' +
                ", third_kind_id=" + third_kind_id +
                ", third_kind_name='" + third_kind_name + '\'' +
                ", third_kind_sale_id=" + third_kind_sale_id +
                ", third_kind_is_retail=" + third_kind_is_retail +
                '}';
    }
}

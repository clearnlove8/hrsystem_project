package com.ck.entity;

/**
 * Title:一级机构
 * Author:何盼
 * Time:2021/4/09
 */
public class First_Kind {
    //主键
    private int ffk_id;
    //一级机构编号
    private int first_kind_id;
    //一级机构名称
    private String first_kind_name;
    //一级机构薪酬发放责任人编号
    private int first_kind_salary_id;
    //一级机构销售责任人编号
    private int first_kind_sale_id;

    public int getFfk_id() {
        return ffk_id;
    }

    public void setFfk_id(int ffk_id) {
        this.ffk_id = ffk_id;
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

    public int getFirst_kind_salary_id() {
        return first_kind_salary_id;
    }

    public void setFirst_kind_salary_id(int first_kind_salary_id) {
        this.first_kind_salary_id = first_kind_salary_id;
    }

    public int getFirst_kind_sale_id() {
        return first_kind_sale_id;
    }

    public void setFirst_kind_sale_id(int first_kind_sale_id) {
        this.first_kind_sale_id = first_kind_sale_id;
    }

    @Override
    public String toString() {
        return "First_Kind{" +
                "ffk_id=" + ffk_id +
                ", first_kind_id=" + first_kind_id +
                ", first_kind_name='" + first_kind_name + '\'' +
                ", first_kind_salary_id=" + first_kind_salary_id +
                ", first_kind_sale_id=" + first_kind_sale_id +
                '}';
    }
}

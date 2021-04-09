package com.ck.entity;

/**
 * Title:公共字段
 * Author:何盼
 * Time:2021/4/09
 */
public class Public_Char {
    //主键，自动增长列
    private int pbc_id;
    //属性的种类
    private String attribute_kind;
    //属性的名称
    private String attribute_name;

    public int getPbc_id() {
        return pbc_id;
    }

    public void setPbc_id(int pbc_id) {
        this.pbc_id = pbc_id;
    }

    public String getAttribute_kind() {
        return attribute_kind;
    }

    public void setAttribute_kind(String attribute_kind) {
        this.attribute_kind = attribute_kind;
    }

    public String getAttribute_name() {
        return attribute_name;
    }

    public void setAttribute_name(String attribute_name) {
        this.attribute_name = attribute_name;
    }

    @Override
    public String toString() {
        return "Public_Char{" +
                "pbc_id=" + pbc_id +
                ", attribute_kind='" + attribute_kind + '\'' +
                ", attribute_name='" + attribute_name + '\'' +
                '}';
    }
}

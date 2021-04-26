package com.ck.entity;

/**
 * 2021/4/25
 * liu
 */
public class Engage_interview {
    //Engage_interview：面试表
    private int ein_id;//主键，自动增长列
    private String human_name;//姓名
    private int interview_amount;//面试次数
    private int human_major_kind_id;//职位分类编号(外健：Config_major_kind表中的major_kind_id)
    private String human_major_kind_name;//职位分类名称
    private int human_major_id;//职位编号(外健：Config_major 表中的major_id)
    private String human_major_name;//职位名称
    private int image_degree;//形象等级
    private int native_language_degree;//口才等级
    private int foreign_language_degree;//外语水平等级
    private int response_speed_degree;//应变能力 (???????)
    private int EQ_degree;//EQ等级
    private int IQ_degree;//IQ_等级
    private String multi_quality_degree;//综合素质
    private String register;//面试人
    private String checker;//筛选人
    private String registe_time;//面试时间
    private String check_time;//筛选时间
    private int resume_id;//简历编号(外健：engage_resume表中res_id)
    private String result;//面试结果
    private String interview_comment;//面试评价
    private String check_comment;//筛选评价
    private int interview_status;//面试状态（）
    private int check_status;//筛选状态 (1.建议面试，2.建议笔试，3.建议录用，4删除简历。)

    public int getEin_id() {
        return ein_id;
    }

    public void setEin_id(int ein_id) {
        this.ein_id = ein_id;
    }

    public String getHuman_name() {
        return human_name;
    }

    public void setHuman_name(String human_name) {
        this.human_name = human_name;
    }

    public int getInterview_amount() {
        return interview_amount;
    }

    public void setInterview_amount(int interview_amount) {
        this.interview_amount = interview_amount;
    }

    public int getHuman_major_kind_id() {
        return human_major_kind_id;
    }

    public void setHuman_major_kind_id(int human_major_kind_id) {
        this.human_major_kind_id = human_major_kind_id;
    }

    public String getHuman_major_kind_name() {
        return human_major_kind_name;
    }

    public void setHuman_major_kind_name(String human_major_kind_name) {
        this.human_major_kind_name = human_major_kind_name;
    }

    public int getHuman_major_id() {
        return human_major_id;
    }

    public void setHuman_major_id(int human_major_id) {
        this.human_major_id = human_major_id;
    }

    public String getHuman_major_name() {
        return human_major_name;
    }

    public void setHuman_major_name(String human_major_name) {
        this.human_major_name = human_major_name;
    }

    public int getImage_degree() {
        return image_degree;
    }

    public void setImage_degree(int image_degree) {
        this.image_degree = image_degree;
    }

    public int getNative_language_degree() {
        return native_language_degree;
    }

    public void setNative_language_degree(int native_language_degree) {
        this.native_language_degree = native_language_degree;
    }

    public int getForeign_language_degree() {
        return foreign_language_degree;
    }

    public void setForeign_language_degree(int foreign_language_degree) {
        this.foreign_language_degree = foreign_language_degree;
    }

    public int getResponse_speed_degree() {
        return response_speed_degree;
    }

    public void setResponse_speed_degree(int response_speed_degree) {
        this.response_speed_degree = response_speed_degree;
    }

    public int getEQ_degree() {
        return EQ_degree;
    }

    public void setEQ_degree(int EQ_degree) {
        this.EQ_degree = EQ_degree;
    }

    public int getIQ_degree() {
        return IQ_degree;
    }

    public void setIQ_degree(int IQ_degree) {
        this.IQ_degree = IQ_degree;
    }

    public String getMulti_quality_degree() {
        return multi_quality_degree;
    }

    public void setMulti_quality_degree(String multi_quality_degree) {
        this.multi_quality_degree = multi_quality_degree;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getRegiste_time() {
        return registe_time;
    }

    public void setRegiste_time(String registe_time) {
        this.registe_time = registe_time;
    }

    public String getCheck_time() {
        return check_time;
    }

    public void setCheck_time(String check_time) {
        this.check_time = check_time;
    }

    public int getResume_id() {
        return resume_id;
    }

    public void setResume_id(int resume_id) {
        this.resume_id = resume_id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getInterview_comment() {
        return interview_comment;
    }

    public void setInterview_comment(String interview_comment) {
        this.interview_comment = interview_comment;
    }

    public String getCheck_comment() {
        return check_comment;
    }

    public void setCheck_comment(String check_comment) {
        this.check_comment = check_comment;
    }

    public int getInterview_status() {
        return interview_status;
    }

    public void setInterview_status(int interview_status) {
        this.interview_status = interview_status;
    }

    public int getCheck_status() {
        return check_status;
    }

    public void setCheck_status(int check_status) {
        this.check_status = check_status;
    }

    @Override
    public String toString() {
        return "Engage_interview{" +
                "ein_id=" + ein_id +
                ", human_name='" + human_name + '\'' +
                ", interview_amount=" + interview_amount +
                ", human_major_kind_id=" + human_major_kind_id +
                ", human_major_kind_name='" + human_major_kind_name + '\'' +
                ", human_major_id=" + human_major_id +
                ", human_major_name='" + human_major_name + '\'' +
                ", image_degree=" + image_degree +
                ", native_language_degree=" + native_language_degree +
                ", foreign_language_degree=" + foreign_language_degree +
                ", response_speed_degree=" + response_speed_degree +
                ", EQ_degree=" + EQ_degree +
                ", IQ_degree=" + IQ_degree +
                ", multi_quality_degree='" + multi_quality_degree + '\'' +
                ", register='" + register + '\'' +
                ", checker='" + checker + '\'' +
                ", registe_time='" + registe_time + '\'' +
                ", check_time='" + check_time + '\'' +
                ", resume_id=" + resume_id +
                ", result='" + result + '\'' +
                ", interview_comment='" + interview_comment + '\'' +
                ", check_comment='" + check_comment + '\'' +
                ", interview_status=" + interview_status +
                ", check_status=" + check_status +
                '}';
    }
}

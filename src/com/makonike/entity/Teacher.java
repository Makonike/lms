package com.makonike.entity;

import java.util.Date;

/**
 * 教师实体类
 *
 * @author Makonike
 * @date 2021-02-23 10:31
 **/
public class Teacher {
    private String id;
    private String name;
    private String sex;
    private Date bornDate;
    private String depNo;
    private String jobTitle;
    private String major;

    public Teacher() {
    }

    public Teacher(String id, String name, String sex, Date bornDate, String depNo, String jobTitle, String major) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.bornDate = bornDate;
        this.depNo = depNo;
        this.jobTitle = jobTitle;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getDepNo() {
        return depNo;
    }

    public void setDepNo(String depNo) {
        this.depNo = depNo;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", bornDate='" + bornDate + '\'' +
                ", dep_no='" + depNo + '\'' +
                ", job_title='" + jobTitle + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}

package com.makonike.entity;

import java.util.Date;

/**
 * 学生实体类
 *
 * @author Makonike
 * @date 2021-02-23 10:25
 **/
public class Student {
    private String id;
    private String name;
    private String sex;
    private Date bornDate;
    private int scores;
    private String depNo;

    public Student() {
    }

    public Student(String id, String name, String sex, Date bornDate, int scores, String depNo) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.bornDate = bornDate;
        this.scores = scores;
        this.depNo = depNo;
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

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public String getDepNo() {
        return depNo;
    }

    public void setDepNo(String depNo) {
        this.depNo = depNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", bornDate='" + bornDate + '\'' +
                ", scores=" + scores +
                ", dep_no='" + depNo + '\'' +
                '}';
    }
}

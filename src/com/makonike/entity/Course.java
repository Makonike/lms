package com.makonike.entity;


import java.util.Date;

/**
 * 课程实体类
 *
 * @author Makonike
 * @date 2021-02-23 10:41
 **/
public class Course {
    private String id;
    private String name;
    private String teacherId;
    private int creditHour;
    private double creditPoint;
    private Date schoolTime;
    private String classPlace;
    private Date examTime;

    public Course() {
    }

    public Course(String id, String name, String teacherId, int creditHour, double creditPoint, Date schoolTime, String classPlace, Date examTime) {
        this.id = id;
        this.name = name;
        this.teacherId = teacherId;
        this.creditHour = creditHour;
        this.creditPoint = creditPoint;
        this.schoolTime = schoolTime;
        this.classPlace = classPlace;
        this.examTime = examTime;
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

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }

    public double getCreditPoint() {
        return creditPoint;
    }

    public void setCreditPoint(double creditPoint) {
        this.creditPoint = creditPoint;
    }

    public Date getSchoolTime() {
        return schoolTime;
    }

    public void setSchoolTime(Date schoolTime) {
        this.schoolTime = schoolTime;
    }

    public String getClassPlace() {
        return classPlace;
    }

    public void setClassPlace(String classPlace) {
        this.classPlace = classPlace;
    }

    public Date getExamTime() {
        return examTime;
    }

    public void setExamTime(Date examTime) {
        this.examTime = examTime;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", creditHour=" + creditHour +
                ", creditPoint=" + creditPoint +
                ", schoolTime=" + schoolTime +
                ", classPlace='" + classPlace + '\'' +
                ", examTime=" + examTime +
                '}';
    }
}
